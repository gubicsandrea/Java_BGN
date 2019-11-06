package shopping;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public int totalPrice() {
        int total = 0;
        for (Product element : products) {
            total = total + element.price;
        }
//        for (int i = 0; i < products.size(); i++) {
//            total = total + products.get(i).price;
//        }
        return total;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
