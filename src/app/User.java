package app;

public class User {

    private final String name;
    private final String phone;
    private final int counter;

    public User(String name, String phone, int counter) {
        this.name = name;
        this.phone = phone;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "\nUser №" + counter + "\nUser name: " + name + "\nUser phone number: " + phone;
    }
}
