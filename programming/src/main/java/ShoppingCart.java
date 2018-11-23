import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double sumOfProductsPrices() {
        double sum = 0;
        for (Product product: products) {
            sum += product.getPrice();
        }
        return sum;
    }
}
