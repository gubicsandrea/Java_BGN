package selection;

import java.util.Scanner;

public class SelectionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot:");
        double number1 = scanner.nextDouble();

        System.out.println("Adjon meg egy másik számot:");
        double number2 = scanner.nextDouble();

        double maxNumber = new Statistics().max(number1, number2);

        System.out.println("A nagyobb szám a(z) " + maxNumber);

        //Lebegőpontos számok egyenlőségének vizsgálata
        System.out.println(Math.abs(3 * 0.1 - 0.3) < 0.00001);
    }
}
