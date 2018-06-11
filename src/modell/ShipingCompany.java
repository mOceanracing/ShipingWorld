package modell;

import controll.CoordinateCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class ShipingCompany {

    private String companyName = "";
    private List ships = new ArrayList<>();
    private int asset = 100000;


    public ShipingCompany(String companyname, List ships) {
        this.companyName = companyname;
        this.ships = ships;
    }

    public List getShips() {
        return ships;
    }

    public String getCompanyName() {
        return companyName;
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
