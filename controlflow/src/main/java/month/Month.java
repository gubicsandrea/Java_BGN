package month;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Január"); break;
            case 2:
                System.out.println("Február"); break;
            case 3:
                System.out.println("Március"); break;
            case 4:
                System.out.println("Április"); break;
            case 5:
                System.out.println("Május"); break;
            case 6:
                System.out.println("Június"); break;
            case 7:
                System.out.println("Július"); break;
            case 8:
                System.out.println("Augusztus"); break;
            case 9:
                System.out.println("Szeptember"); break;
            case 10:
                System.out.println("Október"); break;
            case 11:
                System.out.println("November"); break;
            case 12:
                System.out.println("December"); break;
            default:
                System.out.println("Nem hónap sorszám"); break;
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("tél"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("tavasz"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("nyár"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("ősz"); break;
            default:
                System.out.println("nem hónap sorszám"); break;
        }
    }
}
