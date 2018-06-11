package controll;

import modell.Container;
import modell.Harbor;
import modell.Ship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 11.06.2018.
 */
public class OfferCalculator {

    /**
     * Calculate the offers and return if it´s commercial or not.
     */
    private boolean offerCalc(Container container, Ship ship, List<Container> containersOnMarket) {
        if (clacCost(container.getStartHarbor(), container.getTargetHarbor(), ship) <= clacSalary(container, ship)) {
            return true;
        } else {
            return false;
        }
    }

    private double clacCost(Harbor startHarbor, Harbor tragetHarbor, Ship ship) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(startHarbor.getCoordinates(), tragetHarbor.getCoordinates());
        return (coordinateCalculator.distance().get(0) + 1) * ship.getPricePerMile();
    }

    private double clacSalary(Container container, Ship ship, List<Container> containersOnMarket) {
        int salary = 0;
        salary = salary + container.getSalary();
        for (Container tempContainer : getContainerToTheSameHarbor(containersOnMarket, container.getTargetHarbor())) {
            salary = salary + tempContainer.getSalary();
        }
        return salary;
    }

    private List<Container> getContainerToTheSameHarbor(List<Container> offerContainers, Harbor referenceHarbor) {
        List<Container> containersToTheReferenceHarbor = new ArrayList<>();

        for (Container tempContainer : offerContainers) {
            if (tempContainer.getTargetHarbor().equals(referenceHarbor)) {
                containersToTheReferenceHarbor.add(tempContainer);
            }
        }
        return containersToTheReferenceHarbor;
    }
}
