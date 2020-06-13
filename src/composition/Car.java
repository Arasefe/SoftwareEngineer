package composition;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors) {
        super(name);
        this.doors = doors;
    }
}
