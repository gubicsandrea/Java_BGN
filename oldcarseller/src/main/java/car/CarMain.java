package car;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        Scanner scn = new Scanner(System.in);

        System.out.println("Add meg a rendszámot:");
        car.regNum = scn.nextLine();

        System.out.println("Add meg a gyártási évet:");
        car.year = scn.nextInt();

        if(car.year < 2009) {
            System.out.println("Túl öreg, nem kell");
        } else {
            System.out.println("Megveszem.");
        }
    }
}
