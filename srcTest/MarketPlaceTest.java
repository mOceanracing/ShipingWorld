import modell.*;
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
        Container container = new Container(
                1000,
                3000,
                new Date(01, 01, 2018),
                new Harbor("Valencia", 30, 12000, new Coordinates(39, 29, 00, 0, 22, 0)),
                new Harbor("Lissabon", 20, 10000, new Coordinates(38, 43, 00, 9, 10, 0)));

        ShipingCompany company = new ShipingCompany("Name");

        marketPlace.addContainerToTheMarkedPlace(container);

        marketPlace.acceptOffer(container, company);

        marketPlace.getLog();
    }
}
