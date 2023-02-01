package transport;

import drivers.DriverC;
import mechanics.Mechanic;

public class Truck extends Transport <DriverC> {
    public LoadCapacity loadCapacity;

    @Override
    public void printType() {

    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, DriverC driver, Mechanic mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void startDiagnostics() {

    }

    @Override


    public void printInfo() {

    }


    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение.");
    }
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void bestCircleTime() {
        int min = 90;
        int max = 140;
        int bestTime = (int) (min + (max-min)*Math.random());
        System.out.println("Лучшее время круга для грузовика " + bestTime);

    }

    @Override
    public void maxSpeed() {
        int min = 90;
        int max = 120;
        int maxSpeed = (int) (min + (max-min)*Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);

    }
}
