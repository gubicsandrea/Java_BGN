package multiplier;

import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Adj meg egy számot:");
        int number1 = scn.nextInt();
        System.out.println("Adj meg egy másik számot:");
        int number2 = scn.nextInt();
        System.out.println(number1 + "*" + number2 + "=" + number1 * number2);
    }
}
