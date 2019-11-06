package car;

public class Car {

    private String registrationNumber;
    private int positionX;
    private int positionY;
    private int speed;

    public Car(String registrationNumber, int positionX, int positionY, int speed) {
        validateRegistrationNumber(registrationNumber);

        this.registrationNumber = registrationNumber;
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public Car(String registrationNumber) {
        validateRegistrationNumber(registrationNumber);
        this.registrationNumber = registrationNumber;
        positionX = 100;
        positionY = 100;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        validateRegistrationNumber(registrationNumber);
        this.registrationNumber = registrationNumber;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void validateRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null || registrationNumber.length() < 6 || registrationNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid registrationNumber");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", speed=" + speed +
                '}';
    }

    public void accelerate() {
        speed++;
    }

    public void accelerate(int deltaSpeed) {
        speed += deltaSpeed;
    }

    public void move(int deltaX, int deltaY) {
        positionX += deltaX;
        positionY += deltaY;
    }
}
