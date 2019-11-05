package client;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Client client1 = new Client();
        client1.name = scn.nextLine();
        client1.year = scn.nextInt();
        scn.nextLine();
        client1.address = scn.nextLine();

        System.out.println("Név: "
                + client1.name
                + System.lineSeparator()
                + "Születési év: "
                + client1.year
                + System.lineSeparator()
                + "Cím: "
                + client1.address);
    }
}
