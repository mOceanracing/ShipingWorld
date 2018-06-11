package modell;

import java.util.ArrayList;

/**
 * Created by Marc100 on 08.06.2018.
 */
public class World {
    private ArrayList<Continent> continentList;

    public World(ArrayList<Continent> continentList) {
        this.continentList = continentList;
    }

    public ArrayList<Continent> getContinentList() {
        return continentList;
    }


}
