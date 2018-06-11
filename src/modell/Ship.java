package modell;

import controll.OfferCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc100 on 07.06.2018.
 */
public class Ship {
    private int containerCapacity;
    private int containersActualOnBoard;
    private int speed;
    private int maxSpeed;
    private int money;
    private int fuelCapacity;
    private int fuelStand;
    private double pricePerMile;
    private ShipingCompany shipingCompany;
    private List<Container> containers = new ArrayList<>();

    public Ship(int containerCapacity, int money, int maxSpeed, ShipingCompany shipingCompany) {
        this.containerCapacity = containerCapacity;
        this.money = money;
        this.maxSpeed = maxSpeed;
        this.shipingCompany = shipingCompany;
        this.containersActualOnBoard = 0;
        this.speed = 0;

        new OfferCalculator().getBestOffersForShip(this, this.getShipingCompany());
    }

    public int getContainerCapacity() {
        return containerCapacity;
    }

    public void setContainerCapacity(int containerCapacity) {
        this.containerCapacity = containerCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelStand() {
        return fuelStand;
    }

    public void setFuelStand(int fuelStand) {
        this.fuelStand = fuelStand;
    }

    public double getPricePerMile() {
        return pricePerMile;
    }

    public void setPricePerMile(double pricePerMile) {
        this.pricePerMile = pricePerMile;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void addContainers(Container container) {
        containers.add(container);
    }

    public void removeContainers(Container container) {
        containers.remove(containers.indexOf(container));
    }

    public int getContainersActualOnBoard() {
        return containersActualOnBoard;
    }

    public void setContainersActualOnBoard(int containersActualOnBoard) {
        this.containersActualOnBoard = containersActualOnBoard;
    }

    public ShipingCompany getShipingCompany() {
        return shipingCompany;
    }

    public void setShipingCompany(ShipingCompany shipingCompany) {
        this.shipingCompany = shipingCompany;
    }
}
