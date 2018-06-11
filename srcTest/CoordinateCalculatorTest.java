import controll.CoordinateCalculator;
import modell.Coordinates;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Marc100 on 08.06.2018.
 */


public class CoordinateCalculatorTest {

    @Test
    public void testReverse() {
        Coordinates start = new Coordinates(8, 46, 00, 51,43,00);
        Coordinates target = new Coordinates(9,43,00,52,22,00);

        ArrayList<Integer> distance =  new CoordinateCalculator(start, target).distance();

        Assert.assertEquals(distance.get(0).toString(), "");
    }
}
