public class Shop {
    public static void main(String[] args) {
        Category category1 = new Category("Karty graficzne", "Wydajne karty graficzne");
        Category category2 = new Category("Płyty główne", "Płyty z najnowszymi technologiami");

        Product product1 = new Product(category1, "MSI RTX 3080", "Bardzo wydajna karta graficzna dla miłośników najwyższych ustawień graficznych", 7900);
        Product product2 = new Product(category1, "MSI GTX 1060Ti", "Budżetowa karta graficzna dla średniozaawansowanych graczy", 600);
        Product product3 = new Product(category2, "MSI mpg Gaimig X wifi", "Bardzo wydajna płyta główna na najnowszym chipsecie", 999);
        Product product4 = new Product("AMD ryzen 3600", "Najnowszy wielowątkowy procesor dla graczy jak i grafików", 2900);

        SpecialOffer specialOffer = new SpecialOffer(product1, "Zniżka 20% na najnowszy model RTX", "od 21.02.2021 do 15.05.2021", 0.2);
        product1.getInfo();
        product2.getInfo();
        product3.getInfoWithCategory();
        product4.getInfo();
        specialOffer.specialOferIfno();
    }
}
