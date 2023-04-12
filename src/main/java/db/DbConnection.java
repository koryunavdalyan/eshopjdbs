package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection instance = new DbConnection();

    private Connection connection;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/eshopjdbs?useUnicode";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private DbConnection() {
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static DbConnection getInstance() {
        return instance;
    }
}

