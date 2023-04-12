package manager;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import db.DbConnection;
import model.Category;

import java.sql.*;

public class CategoryManager {
    private Connection connection = DbConnection.getInstance().getConnection();

    public void addCategory(Category category) {
        String sql = "insert into category(name) values (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, category.getName());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                category.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public Category editCategoryBydId(int id) {
        String sql = "update category set name = ? where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return getCategoryFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return null;
    }

    private Category getCategoryFromResultSet(ResultSet resultSet) throws SQLException {
        return Category.builder()
                .id(resultSet.getInt("id"))
                .name(resultSet.getString("name"))
                .build();


    }

    public void removeById(int id) {
        String sql = "DELETE FROM `eshop`.`category` WHERE id = " + id;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
