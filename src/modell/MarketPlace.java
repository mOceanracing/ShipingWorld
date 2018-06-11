package modell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 09.06.2018.
 */
public class MarketPlace {
    private static MarketPlace marketPlace;
    private List<Container> offerContainers;
    private List<String> log;

    public MarketPlace() {
        this.offerContainers = new ArrayList<>();
        this.log = new ArrayList();
    }

    /**
     * Generate Singelton instance. Only one Market Place
     * @return marketPlace
     */
    public static synchronized MarketPlace getInstance () {
        if (MarketPlace.marketPlace == null) {
            MarketPlace.marketPlace = new MarketPlace ();
        }
        return  MarketPlace.marketPlace;
    }

    public List<Container> getOfferContainers() {
        return offerContainers;
    }

    public void addContainerToTheMarkedPlace(Container offerContainer) {
        this.offerContainers.add(offerContainers.size(), offerContainer);
    }

    public void acceptOffer(Container offerContainer, ShipingCompany company) {
        Container container = this.getOfferContainers().remove(this.offerContainers.indexOf(offerContainer));
        log.add("|| Container: "+ container.toString() + "||  Company: " + company.getCompanyName());
    }

    public List<String> getLog() {
        return log;
    }
}
