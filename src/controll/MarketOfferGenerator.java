package controll;

import modell.Container;
import modell.MarketPlace;
import modell.World;

import java.util.Date;
import java.util.Random;

/**
 * Created by Marc100 on 11.06.2018.
 */
public class MarketOfferGenerator {
    Random random = new Random();

    public void offerGenerator(World world) {
        for (int i = 0; i < random.nextInt(70); i++) {
            Container container = new Container(
                    random.nextInt(5000),
                    random.nextInt(10000),
                    new Date(),
                    world.getContinentList().get(0).getHarborList().get(random.nextInt(world.getContinentList().size())),
                    world.getContinentList().get(0).getHarborList().get(random.nextInt(world.getContinentList().size())));

            MarketPlace.getInstance().addContainerToTheMarkedPlace(container);
        }

    }


}
