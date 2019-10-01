package client;

public class Client {

    private String name;

    private int year;

    private String address;

    public Client(String name, int year, String address) {

        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
