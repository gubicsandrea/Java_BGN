package statements;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4 * a;
        double y =  (a + b) / 2;
        int x = (int) y;
        System.out.println(y);

        String result = x < 5 ? "kicsi" : "nagy";
    }
}
