package max;

import java.util.Scanner;

public class MaxFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int number1 = scanner.nextInt();
        System.out.println("Adj meg egy másik számot:");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }
}
