package multiplier;

import java.util.Scanner;

public class Multiplier {

    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy egész számot!");
        number1 = scanner.nextInt();
        System.out.println("Adj meg egy egész számot!");
        number2 = scanner.nextInt();
        scanner.close();

        int result = number1 * number2;

        System.out.println(number1 + " * " + number2 + " = " + result);
    }
}
