package modell;

import java.util.ArrayList;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class Continent {
    private String contionentName;
    private ArrayList<Harbor> harborList;

    public Continent(String contionentName, ArrayList<Harbor> harborList) {
        this.contionentName = contionentName;
        this.harborList = harborList;
    }

    public String getContionentName() {
        return contionentName;
    }

    public ArrayList<Harbor> getHarborList() {
        return harborList;
    }
}
