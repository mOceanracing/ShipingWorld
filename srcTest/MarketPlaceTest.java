import modell.Container;
import modell.MarketPlace;
import modell.ShipingCompany;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Marc100 on 09.06.2018.
 */
public class MarketPlaceTest {

    private MarketPlace marketPlace = new MarketPlace();

    @Test
    public void acceptOfferTest() {
        Container container = new Container(1000, 3000, new Date(01, 01, 2018));
        ShipingCompany company = new ShipingCompany("Name");

        marketPlace.addContainerToTheMarkedPlace(container);

        marketPlace.acceptOffer(container, company);

        marketPlace.getLog();
    }
}
