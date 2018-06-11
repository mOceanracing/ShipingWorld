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

    public double distance(Coordinates start, Coordinates target) {
        return distance(
                getDDCoordinatesFromDMSCoordinatesEast(start),
                getDDCoordinatesFromDMSCoordinatesNorth(start),
                getDDCoordinatesFromDMSCoordinatesEast(target),
                getDDCoordinatesFromDMSCoordinatesNorth(target));

    }

    public double distance(double lat1, double lon1, double lat2, double lon2) {
        int radius = 6371;
        double lat = Math.toRadians(lat2 - lat1);
        double lon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(lat / 2) * Math.sin(lat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(lon / 2) * Math.sin(lon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = radius * c;
        return Math.abs(d);
    }

    public double getDDCoordinatesFromDMSCoordinatesNorth(Coordinates coordinates) {
        double ddCoordinates = coordinates.getHoursNorth();
        double ddCooordinatesMinSec = (((double) coordinates.getMinutesNorth() / 60)) + (((double) coordinates.getSecondsNorth() / 60) / 100);
        return ddCoordinates + ddCooordinatesMinSec;
    }

    public double getDDCoordinatesFromDMSCoordinatesEast(Coordinates coordinates) {
        double ddCoordinates = coordinates.getHoursEast();
        double ddCooordinatesMinSec = (((double) coordinates.getMinutesEast() / 60)) + (((double) coordinates.getSecondsEast() / 60) / 100);
        return ddCoordinates + ddCooordinatesMinSec;
    }


    public Coordinates getStart() {
        return start;
    }

    public Coordinates getTarget() {
        return target;
    }
}
