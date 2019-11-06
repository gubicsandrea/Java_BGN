import car.Car;

public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car("XYZ-123",10, 22, 54);
        Car yourCar = new Car("ABC-987", 23, 45, 60);
        Car myCar2 = myCar;
        System.out.println(myCar2);
        myCar.setSpeed(100);
        System.out.println(myCar);
        myCar.accelerate();
        System.out.println(myCar);
        myCar.move(10, -4);
        System.out.println(myCar);
        myCar.accelerate(-5);
        System.out.println(myCar);
        String newReginstrationNumber = "VVV-444";
        changeRegNum(newReginstrationNumber, myCar);
        System.out.println(myCar);

        int x = 6;
        increaseNumber(x);
        System.out.println(x);
    }

    public static void changeRegNum(String newRegNum, Car carToChange) {
        carToChange.setRegistrationNumber(newRegNum);
        carToChange = new Car("BBB-111");
    }

    public static void increaseNumber(int a) {
        a++;
    }
}
