package iteration;

import java.util.Scanner;

public class IterationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy betűt");
        String character = scanner.next();
        System.out.println("Adj meg egy egész számot");
        int number = scanner.nextInt();

//        for(int i = 0; i < number; i++) {
//            System.out.println(character);
//        }

        int i = 0;
        while(i < number) {
            System.out.println(character);
            i++;
        }

        System.out.println("Sor");
        int sor = scanner.nextInt();
        System.out.println("Oszlop");
        int oszlop = scanner.nextInt();

        for(int k = 0; k < sor; k++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
