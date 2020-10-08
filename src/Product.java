public class Product {
    Category category;
    String name;
    String description;
    double price;

    Product(Category c, String n, String d, double p) {
        category = c;
        name = n;
        description = d;
        price = p;
    }

    Product(String n, String d, double p) {
        name = n;
        description = d;
        price = p;
    }
    void getInfo (){
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println();
    }
    void getInfoWithCategory (){
        System.out.println(category.categoryName);
        System.out.println(category.categoryDecription);
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println();
    }
}
