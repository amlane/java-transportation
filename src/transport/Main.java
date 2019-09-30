package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Horse seabiscuit = new Horse("SeaBiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();

        System.out.println("Seabiscuit's fuel level: " + seabiscuit.getFuelLevel());
        System.out.println();

        System.out.println("*** From Abstract Classes ***");
        HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
        secretariat.addFuel(10);
        System.out.println("Secretariat " + secretariat.getFuelLevel());
        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);
        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
        eclipse.move(10);
        System.out.println(eclipse.getName() + " " + eclipse.getFuelLevel());

        Auto vw = new Auto(1, "EuroVan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto(5, "Accord", 2003);

        vw.move();
        vw.move(5);
        System.out.println(vw.getName() + " " + vw.getFuelLevel());
        System.out.println();

        System.out.println("*** Array List ***");

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();

        myList.add(secretariat);
        myList.add(vw);
        myList.add(trigger);
        myList.add(seattleSlew);
        myList.add(americanPharoah);
        myList.add(eclipse);
        // myList.add(joe); Horse is not tied to AbstractVehicle
        myList.add(toyota);
        myList.add(honda);

        System.out.println("*** The List ***");
        System.out.println(myList.toString());
        System.out.println();
    }
}