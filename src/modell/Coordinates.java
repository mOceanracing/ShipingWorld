package modell;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class Coordinates {
    private int hoursNorth;
    private int minutesNorth;
    private int secondsNorth;

    private int hoursEast;
    private int minutesEast;
    private int secondsEast;

    public Coordinates(int hoursNorth, int minutesNorth, int secondsNorth, int hoursEast, int minutesEast, int secondsEast) {
        this.hoursNorth = hoursNorth;
        this.minutesNorth = minutesNorth;
        this.secondsNorth = secondsNorth;
        this.hoursEast = hoursEast;
        this.minutesEast = minutesEast;
        this.secondsEast = secondsEast;
    }

    public int getHoursNorth() {
        return hoursNorth;
    }

    public int getMinutesNorth() {
        return minutesNorth;
    }

    public int getSecondsNorth() {
        return secondsNorth;
    }

    public int getHoursEast() {
        return hoursEast;
    }

    public int getMinutesEast() {
        return minutesEast;
    }

    public int getSecondsEast() {
        return secondsEast;
    }

    @Override
    public String toString() {
        String gradeSign = "° ";
        String coordinatesNorth = getHoursNorth() + gradeSign + getMinutesNorth() + gradeSign + getSecondsNorth() + " E";
        String coordinatesEast = getHoursEast() + gradeSign + getMinutesEast() + gradeSign + getSecondsEast() + " E";
        return coordinatesNorth + ", " + coordinatesEast;
    }
}
