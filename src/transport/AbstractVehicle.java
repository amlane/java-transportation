package transport;

public abstract class AbstractVehicle {
    protected int fuel;

    // super(fuel) calls this function
    public AbstractVehicle(int fuel) {
        this.fuel = fuel;
    }

    // default constructor because there are no params
    // so when you create a new HorseFromVehicle w/ just a name
    // their fuel level will be 1
    public AbstractVehicle() {
        fuel = 1;
    }

    public abstract String getPath();

    public abstract String getName();

    public void move() {
        fuel--;
    }

    public void move(int steps) {
        fuel = fuel - steps;
    }

    public int getFuelLevel() {
        return fuel;
    }

    public void addFuel(int i) {
        fuel = fuel + i;
    }
}