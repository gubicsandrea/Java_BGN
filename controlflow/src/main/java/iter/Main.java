package iter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        String character;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Adj meg egy számot");
            count = scanner.nextInt();
        } while(count < 1 || count > 100);
        do {
            System.out.println("Adj meg egy karaktert");
            character = scanner.next();
        } while(character.length() != 1);

        for (int i = 0; i < count; i++) {
            System.out.print(character);
        }
    }
}
