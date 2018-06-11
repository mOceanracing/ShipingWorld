package controll;

import modell.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class main {
    private static World world;


    public static void main(String[] args) {
        createNewWorld();
        new MarketOfferGenerator().offerGenerator(world);
        createNewMarketPlace();
        createCompany("asd", 3);

    }

    public static void createNewWorld() {
        List continentList = new ArrayList<>();
        List europeHarbours = new ArrayList<Harbor>();

        europeHarbours.add(new Harbor("Valencia", 30, 12000, new Coordinates(39, 29, 00, 0, 22, 0)));
        europeHarbours.add(new Harbor("Lissabon", 20, 10000, new Coordinates(38, 43, 00, 9, 10, 0)));
        europeHarbours.add(new Harbor("Rotterdam", 50, 11100, new Coordinates(51, 56, 00, 4, 29, 0)));
        europeHarbours.add(new Harbor("Hamburg", 50, 8000, new Coordinates(53, 33, 00, 10, 0, 0)));

        continentList.add(new Continent("Europe", (ArrayList<Harbor>) europeHarbours));

        world = new World((ArrayList<Continent>) continentList);
    }

    public static void createNewMarketPlace() {
        Container container1 = new Container(20000,3000, new Date(),world.getContinentList().get(0).getHarborList().get(0), world.getContinentList().get(0).getHarborList().get(1));
        new Harbor("", 0, 0, new Coordinates(0,0,0,0,0,0));
        MarketPlace.getInstance().addContainerToTheMarkedPlace(container1);
    }

    public static ShipingCompany createCompany(String name, int nrOfShips) {
        List ships = new ArrayList<>();
        ShipingCompany shipingCompany = new ShipingCompany(name);

        while (nrOfShips > 0) {
            ships.add(new Ship(10, 100000, 23, shipingCompany));
            nrOfShips = nrOfShips - 1;
        }

        shipingCompany.setShips(ships);

        return shipingCompany;
    }


}
