package classes.car;

public class CarMain {

    public static String attr;

    public static void main(String[] args) {
//        Car car = new Car("ABC-123");
//        Car car2 = new Car("XYZ-000", 10, 20,5);
//
//        int number = 20;
//        printCar(number, car);
//
//        System.out.println();
//        System.out.println(car);
//        System.out.println(number);
//        //printCar(car2);

        String fruit = "alma";
        fruit = fruit.concat("korte");
        System.out.println(fruit);

//        car.accelerate();
//
//        System.out.println(car.toString());
//
//        car.move(10, -2);
//
//        printCar(car);
//
//        car.accelerate(10);
//
//        System.out.println(car.toString());
//
//        car.setRegistrationNumber("XXX-111");
//
//        System.out.println(car.toString());

    }

    public static void printCar(int x, Car car) {
        x = 6;
        car.setRegistrationNumber("VVV-999");
        System.out.println(x);
        System.out.println(car);
    }
}
