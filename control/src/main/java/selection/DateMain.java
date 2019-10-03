package selection;

import java.util.Scanner;

public class DateMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Month month = new Month();

        System.out.println(month.monthNameWithSwitch(number));
        System.out.println(month.seasonByNumberOfMonth(number));
    }
}
