package transport;

public class HorseFromVehicle extends AbstractVehicle {
    private String name;

    public HorseFromVehicle(String name, int fuel) {
        // super means call the parent constructor
        super(fuel);
        this.fuel *= 2;
        this.name = name;
    }

    // if you create a new HorseFromVehicle using just a name
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