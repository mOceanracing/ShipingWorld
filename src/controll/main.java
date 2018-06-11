package controll;

import modell.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class main {

    public static void main(String[] args) {
        createNewWorld();
        createCompany("asd", 3);
    }

    public static void createNewWorld() {
        World world;
        List continentList = new ArrayList<>();
        List europeHarbours = new ArrayList<Harbor>();


        europeHarbours.add(new Harbor("Valencia", 30, 12000, new Coordinates(39, 29, 00, 0, 22, 0)));
        europeHarbours.add(new Harbor("Lissabon", 20, 10000, new Coordinates(38, 43, 00, 9, 10, 0)));
        europeHarbours.add(new Harbor("Rotterdam", 50, 11100, new Coordinates(51, 56, 00, 4, 29, 0)));
        europeHarbours.add(new Harbor("Hamburg", 50, 8000, new Coordinates(53, 33, 00, 10, 0, 0)));

        continentList.add(new Continent("Europe", (ArrayList<Harbor>) europeHarbours));

        world = new World((ArrayList<Continent>) continentList);

        System.out.print(world.getContinentList().get(0).getHarborList().get(0).getCoordinates().toString() + "\n");
        System.out.print(world.getContinentList().get(0).getHarborList().get(1).getCoordinates().toString() + "\n");
        System.out.print(world.getContinentList().get(0).getHarborList().get(2).getCoordinates().toString() + "\n");
        System.out.print(world.getContinentList().get(0).getHarborList().get(3).getCoordinates().toString() + "\n");
    }

    public static ShipingCompany createCompany(String name, int nrOfShips) {
        List ships = new ArrayList<>();

        while (nrOfShips > 0) {
            ships.add(new Ship(1, 1000, 50));
            nrOfShips = nrOfShips - 1;
        }
        return new ShipingCompany(name, ships);
    }


}
