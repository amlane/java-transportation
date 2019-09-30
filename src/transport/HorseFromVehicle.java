package transport;

public class HorseFromVehicle extends AbstractVehicle {
    private String name;

    public HorseFromVehicle(String name, int fuel) {
        // super means call the parent constructor
        super(fuel);
        this.name = name;
    }

    public HorseFromVehicle(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return "Gravel";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HorseFromVehicle{" + "name= " + name + "\'" + ", fuel= " + fuel + "}";
    }

}