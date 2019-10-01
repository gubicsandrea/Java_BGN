package client;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét:");
        String name = scanner.nextLine();
        System.out.println("Adja meg a születési évét:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a címét:");
        String address =  scanner.nextLine();

        Client client = new Client(name, yearOfBirth, address);

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());
    }
}
