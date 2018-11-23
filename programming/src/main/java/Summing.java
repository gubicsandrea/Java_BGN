public class Summing {

//    public static void main(String[] args) {
//        int[] numbers = {4, 7, 12, -6, 7};
//
//        int sum = 0;
//        for (int number: numbers) {
//            sum += number;
//        }
//
//        System.out.println("Fizetendő összeg: " + sum);
//    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("lemezjátszó", 15000);
        cart.addProduct(product1);
        cart.addProduct(new Product("mikulássapka", 300));
        cart.addProduct(new Product("nyuszis papucs", 4000));
        cart.addProduct(new Product("VR játék", 27000));
        double sumOfProduts = cart.sumOfProductsPrices();
        System.out.println(sumOfProduts);
        cart.removeProduct(product1);
        sumOfProduts = cart.sumOfProductsPrices();
        System.out.println(sumOfProduts);
    }
}
