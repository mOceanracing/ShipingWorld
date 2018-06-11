package modell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 09.06.2018.
 */
public class MarketPlace {
    private List<Container> offerContainers = new ArrayList<>();
    private List<String> log = new ArrayList();

    public List<Container> getOfferContainers() {
        return offerContainers;
    }

    public void addContainerToTheMarkedPlace(Container offerContainer) {
        this.offerContainers.add(offerContainers.size(), offerContainer);
    }

    public void acceptOffer(Container offerContainer, ShipingCompany company) {
        Container container = this.getOfferContainers().remove(this.offerContainers.indexOf(offerContainer));
        log.add("Container: " + container.toString() + " Company: " + company.getCompanyName());
    }

    public List<String> getLog() {
        return log;
    }
}
