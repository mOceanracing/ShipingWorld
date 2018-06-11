package modell;

import controll.CoordinateCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class ShipingCompany {

    private String companyName = "";
    private List ships = new ArrayList<>();

    public ShipingCompany(String companyname, List ships) {
        this.companyName = companyname;
        this.ships = ships;
    }

    public List getShips() {
        return ships;
    }

    public String getCompanyName() {
        return companyName;
    }


    /**
     * Calculate the offers and return if it´s commercial.
     */
    private boolean offerCalc(Container container, Ship ship) {
        if (clacCost(container, ship) <= clacSalary(container, ship)) {
            return true;
        } else {
            return false;
        }
    }

    private double clacCost(Container container, Ship ship) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(container.getStartHarbor().getCoordinates(), container.getTargetHarbor().getCoordinates());
        return (coordinateCalculator.distance().get(0) + 1) * ship.getPricePerMile();
    }

    private double clacSalary(Container container, Ship ship) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(container.getStartHarbor().getCoordinates(), container.getTargetHarbor().getCoordinates());





        if (((coordinateCalculator.distance().get(0) + 1) * ship.getPricePerMile()) < container.getPrice()) {
            return true;
        } else {
            return false;
        }
    }




}
