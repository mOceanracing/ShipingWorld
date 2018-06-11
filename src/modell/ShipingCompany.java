package modell;

import controll.CoordinateCalculator;
import controll.OfferCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class ShipingCompany {

    private String companyName = "";
    private List ships = new ArrayList<>();
    private int asset = 100000;


    public ShipingCompany(String companyname) {
        this.companyName = companyname;
    }

    public List getShips() {
        return ships;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setShips(List ships) {
        this.ships = ships;
    }

    public int getAsset() {
        return asset;
    }

    public void addBill(int bill) {
        this.asset = this.asset - bill;
    }

    public void addSalary(int Salary) {
        this.asset = this.asset + Salary;
    }
}
