package classes.car;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("ABC-123");

        System.out.println(car.getRegistrationNumber());
        System.out.println("(" + car.getPositionX() + "," + car.getPositionY() + ")");
        System.out.println(car.getSpeed());

        car.accelerate();

        System.out.println(car.getRegistrationNumber());
        System.out.println("(" + car.getPositionX() + "," + car.getPositionY() + ")");
        System.out.println(car.getSpeed());

        car.move(10, -2);

        System.out.println(car.getRegistrationNumber());
        System.out.println("(" + car.getPositionX() + "," + car.getPositionY() + ")");
        System.out.println(car.getSpeed());

        car.accelerate(10);

        System.out.println(car.getRegistrationNumber());
        System.out.println("(" + car.getPositionX() + "," + car.getPositionY() + ")");
        System.out.println(car.getSpeed());

        car.setRegistrationNumber("XXX-111");

        System.out.println(car.getRegistrationNumber());
        System.out.println("(" + car.getPositionX() + "," + car.getPositionY() + ")");
        System.out.println(car.getSpeed());

    }
}
