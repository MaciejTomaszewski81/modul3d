public class SpecialOffer {
    Product product;
    String offerDescription;
    String offerDuration;
    double discount;

    SpecialOffer(Product p, String offDesc, String offDuration, double d) {
        product = p;
        offerDescription = offDesc;
        offerDuration = offDuration;
        discount = d;
    }
    void specialOferIfno(){
        System.out.println(product.name);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(offerDescription);
        System.out.println(offerDuration);
        System.out.println(discount);
    }
}
