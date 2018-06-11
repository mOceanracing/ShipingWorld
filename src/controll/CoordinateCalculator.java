package controll;

import modell.Coordinates;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class CoordinateCalculator {

    private Coordinates start;
    private Coordinates target;


    public CoordinateCalculator(Coordinates start, Coordinates target) {
        this.start = start;
        this.target = target;
    }

    public ArrayList<Integer> distance() {
        List distance = new ArrayList<Integer>();
        double distancea = new Double(0);

        double distanceHrsN = target.getHoursNorth() - start.getHoursNorth();
        double distanceMinN = target.getMinutesNorth() - start.getMinutesNorth();
        double distanceSecN = target.getSecondsNorth() - start.getSecondsNorth();

        double distanceHrsE = target.getHoursNorth() - start.getHoursNorth();
        double distanceMinE = target.getMinutesNorth() - start.getMinutesNorth();
        double distanceSecE = target.getSecondsNorth() - start.getSecondsNorth();

        double distanceHrs = Math.sqrt((distanceHrsN * distanceHrsN) + (distanceHrsE * distanceHrsE));
        double distanceMin = Math.sqrt((distanceMinN * distanceMinN) + (distanceMinE * distanceMinE));
        double distanceSec = Math.sqrt((distanceSecN * distanceSecN) + (distanceSecE * distanceSecE));


        distance.add((int) distanceHrs);
        distance.add((int) distanceMin);
        distance.add((int) distanceSec);

        return (ArrayList<Integer>) distance;
    }

    public Coordinates getStart() {
        return start;
    }

    public Coordinates getTarget() {
        return target;
    }
}
