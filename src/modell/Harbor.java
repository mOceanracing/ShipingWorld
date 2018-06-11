package modell;

/**
 * Created by Marc100 on 07.06.2018.
 */
public class Harbor {

    private String name;
    private int shipCapacity;
    private int ships;
    private int dayFee;
    private boolean state;
    private Coordinates coordinates;

    public Harbor(String name, int shipCapacity, int dayFee, Coordinates coordinates) {
        this.name = name;
        this.shipCapacity = shipCapacity;
        this.dayFee = dayFee;
        this.coordinates = coordinates;
    }

    public int getShipCapacity() {
        return shipCapacity;
    }

    public void setShipCapacity(int shipCapacity) {
        this.shipCapacity = shipCapacity;
    }

    public int getShips() {
        return ships;
    }

    public void setShips(int ships) {
        this.ships = ships;
    }

    public int getDayFee() {
        return dayFee;
    }

    public void setDayFee(int dayFee) {
        this.dayFee = dayFee;
    }

    public boolean isState() {
        if (shipCapacity > ships){
            return true;
        }else {
            return false;
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
