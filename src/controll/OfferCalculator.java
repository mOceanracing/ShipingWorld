package controll;

import modell.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 11.06.2018.
 */
public class OfferCalculator {
    private MarketPlace marketPlace = MarketPlace.getInstance();

    public void getBestOffersForShip(Ship ship, ShipingCompany company) {
        int offers = marketPlace.getOfferContainers().size();
        for (int i = 0; i <= offers; i++) {
            if (marketPlace.getOfferContainers().size() > i && marketPlace.getOfferContainers().size() != 0) {
                Container container = marketPlace.getOfferContainers().get(i);
                if (offerCalc(container, ship) && ship.getContainerCapacity() > ship.getContainersActualOnBoard()) {
                    MarketPlace.getInstance().acceptOffer(container, company);
                }
            }
        }
    }

    /**
     * Calculate the offers and return if it´s commercial or not.
     */
    private boolean offerCalc(Container container, Ship ship) {
        if (clacCost(container.getStartHarbor(), container.getTargetHarbor(), ship) <= clacSalary(container)) {
            return true;
        } else {
            return false;
        }
    }

    private double clacCost(Harbor startHarbor, Harbor tragetHarbor, Ship ship) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(startHarbor.getCoordinates(), tragetHarbor.getCoordinates());
        return (coordinateCalculator.distance(startHarbor.getCoordinates(), tragetHarbor.getCoordinates()) * ship.getPricePerMile());
    }

    private double clacSalary(Container container) {
        int salary = 0;
        MarketPlace.getInstance().getOfferContainers();
        salary = salary + container.getSalary();
        for (Container tempContainer : getContainerToTheSameHarbor(container.getTargetHarbor())) {
            salary = salary + tempContainer.getSalary();
        }
        return salary;
    }

    private List<Container> getContainerToTheSameHarbor(Harbor referenceHarbor) {
        List<Container> containersToTheReferenceHarbor = new ArrayList<>();

        for (Container tempContainer : MarketPlace.getInstance().getOfferContainers()) {
            if (tempContainer.getTargetHarbor().equals(referenceHarbor)) {
                containersToTheReferenceHarbor.add(tempContainer);
            }
        }
        return containersToTheReferenceHarbor;
    }
}
