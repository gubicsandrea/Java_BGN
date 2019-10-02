package classes.car;

/**
 * Ez az osztály egy autót modellez.
 *
 * @author Gubics Andrea
 */
public class Car {

    private String registrationNumber;
    private int positionX;
    private int positionY;
    private int speed;

    /**
     *
     * @param registrationNumber
     * @param positionX
     * @param positionY
     * @param speed
     */
    public Car(String registrationNumber, int positionX, int positionY, int speed) {

        this.registrationNumber = registrationNumber;
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    /**
     *
     * @param registrationNumber az autó rendszáma "XXX-000" alakban
     * @throws IllegalArgumentException ha a rendszám nem jó fomátumú vagy hiányzik
     */
    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        positionX = 100;
        positionY = 100;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
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

    /**
     * 1 egységgel gyorsítja az autót.
     */
    public void accelerate() {
        speed++;
    }

    public void accelerate(int deltaSpeed) {
        speed += deltaSpeed;
    }

    public void move(int deltaX, int deltaY) {
        positionX = positionX + deltaX;
        positionY += deltaY;
    }
}
