package comands;

public interface Command {
    int EXIT = 0;
    int ADD_CATEGORY = 1;
    int EDIT_CATEGORY_BY_ID = 2;
    int DELETE_CATEGORY_BY_ID = 3;
    int ADD_PRODUCT = 4;
    int EDIT_PRODUCT_BY_ID = 5;
    int DELETE_PRODUCT_BY_ID = 6;
    int PRINT_SUM_OF_PRODUCTS = 7;
    int PRINT_MAX_OF_PRICE_PRODUCT = 8;
    int PRINT_MIN_OF_PRICE_PRODUCT = 9;
    int PRINT_AVG_OF_PRICE_PRODUCT = 10;
    static void printCommands(){
        System.out.println("input " + EXIT + " for exit");
        System.out.println("input " + ADD_CATEGORY + " for add category");
        System.out.println("input " + EDIT_CATEGORY_BY_ID + " for edit category by id");
        System.out.println("input " + DELETE_CATEGORY_BY_ID + " for delete category by id");
        System.out.println("input " + ADD_PRODUCT + " for add product");
        System.out.println("input " + EDIT_PRODUCT_BY_ID+ " for edit product");
        System.out.println("input " + DELETE_PRODUCT_BY_ID + " for delete product by id");
        System.out.println("input " + PRINT_SUM_OF_PRODUCTS + " for print sum of products");
        System.out.println("input " + PRINT_MAX_OF_PRICE_PRODUCT + " for print max of product");
        System.out.println("input " + PRINT_MIN_OF_PRICE_PRODUCT + " for print min of product");
        System.out.println("input " + PRINT_AVG_OF_PRICE_PRODUCT + " for print avg of product");



    }


}
