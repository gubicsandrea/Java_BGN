package shopping;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Product product1 = new Product();
        product1.name = "ball";
        product1.price = 23;
        basket.add(product1);
        Product product2 = new Product();
        product2.name = "shampoo";
        product2.price = 35;
        basket.add(product2);
        Product product3 = new Product();
        product3.name = "apple";
        product3.price = 7;
        basket.add(product3);

        List<Product> basketItems = basket.getProducts();
        basketItems.add(product3);
        int total = basket.totalPrice();
        System.out.println("Fizetendő: " + total);
        System.out.println(product2);

        Product productA = new Product();
        productA.name = "ball";
        productA.price = 23;

        System.out.println(product1 == productA);
    }
}
