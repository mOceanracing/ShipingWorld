import controll.CoordinateCalculator;
import modell.Coordinates;
import org.junit.Test;

/**
 * Created by Marc100 on 08.06.2018.
 */


public class CoordinateCalculatorTest {

    @Test
    public void reverse_TEST() {
        Coordinates start = new Coordinates(8, 46, 00, 51,43,00);
        Coordinates target = new Coordinates(9,43,00,52,22,00);

//        ArrayList<Integer> distance =  new CoordinateCalculator(start, target).distance();
//
//        Assert.assertEquals(distance.get(0).toString(), "");
    }

    @Test
    public void getDDCoordinatesFromDMSCoordinatesNORTH_TEST() {
        Coordinates start = new Coordinates(8, 46, 00, 51,43,00);
        Coordinates target = new Coordinates(9,43,00,52,22,00);

        CoordinateCalculator coordinateCalculator =  new CoordinateCalculator(start, target);

        coordinateCalculator.getDDCoordinatesFromDMSCoordinatesNorth(new Coordinates(45,25,58,00,00,00));
    }

}
