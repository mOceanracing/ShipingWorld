package modell;

import java.util.Date;

/**
 * Created by Marc100 on 07.06.2018.
 */
public class Container {
    private int maxWeight;
    private int weight;
    private int salary;
    private Harbor startHarbor;
    private Harbor targetHarbor;
    private Date sendingDate;
    private Date expectedArrivingDate;
    private Date arrivingDate;

    public Container(int weight, int salary, Date expectedArrivingDate) {
        this.weight = weight;
        this.salary = salary;
        this.expectedArrivingDate = expectedArrivingDate;
        this.startHarbor = new Harbor("", 0, 0, new Coordinates(0,0,0,0,0,0));
        this.targetHarbor = new Harbor("", 0, 0, new Coordinates(0,0,0,0,0,0));
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

    public Date getExpectedArrivingDate() {
        return expectedArrivingDate;
    }

    public void setExpectedArrivingDate(Date expectedArrivingDate) {
        this.expectedArrivingDate = expectedArrivingDate;
    }

    public Date getArrivingDate() {
        return arrivingDate;
    }

    public void setArrivingDate(Date arrivingDate) {
        this.arrivingDate = arrivingDate;
    }

    public Harbor getStartHarbor() {
        return startHarbor;
    }

    public void setStartHarbor(Harbor startHarbor) {
        this.startHarbor = startHarbor;
    }

    public Harbor getTargetHarbor() {
        return targetHarbor;
    }

    public void setTargetHarbor(Harbor targetHarbor) {
        this.targetHarbor = targetHarbor;
    }

    @Override
    public String toString() {
        return "Weight: " + getWeight() + " Price: " + getSalary() + " Expected arrivingDate:" + getExpectedArrivingDate();
    }
}
