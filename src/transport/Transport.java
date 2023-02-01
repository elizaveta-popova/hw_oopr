package transport;

import drivers.Driver;
import mechanics.Mechanic;

import java.util.ArrayList;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private Mechanic mechanic;

    private final ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public Transport(String brand, String model, double engineVolume, T driver, Mechanic mechanic) {
        if (brand==null || brand.isEmpty() || model==null || model.isEmpty()) {
            this.brand = "default";
            this.model = "default";

        } else {
            this.brand = brand;
            this.model = model;
        }
        this.mechanic=mechanic;
        setEngineVolume(engineVolume);
        setDriver(driver);
//        if (country == null || country.isEmpty()) {
//            this.country = "default";
//        } this.country = country;
//        setColor(color);
//        if (year <=0) {
//            this.year = 2000;
//        } else {
//            this.year = year;
//        }
//        setMaxSpeed(maxSpeed);
    }

//    private String color;
//    private final int year;
//    private final String country;
//    private int maxSpeed;



    @Override
    public String toString() {
        return "Марка: " + brand + ". " +
                "Модель: " + model + ". " +
                "Объём двигателя: " + engineVolume + ". " +
                "Водитель: " + driver + ". ";
//                "Цвет кузова: " + color + ". " +
//                "Год производства: " + year + ". " +
//                "Страна сборки: " + country + ". " +
//                "Максимальная скорость: " + maxSpeed + ". ";
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }



    public abstract void printType ();
    public abstract void printInfo ();
    public abstract void startMove ();
    public abstract void finishMove ();
//    public void startDiagnostics () throws CantStartDiagnosticsException {
//        System.out.println("Начинаю диагностику транспортного средства.");
//    }

   public abstract void  startDiagnostics () throws CantStartDiagnosticsException;
    public static void startDiagnostics (Transport... transports) {
    for (Transport transport : transports){
        try {
            transport.startDiagnostics();
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка.");
            System.out.println(e.getMessage());
        } catch (CantStartDiagnosticsException e) {
            throw new RuntimeException(e);
        }
    }
}
//    public void printInfo () {
//        System.out.println("Водитель " + driver.getName() + " управляет автомобилем" + getBrand() + " и будет участвовать в заезде");
//    }


    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
            if (engineVolume<=0) {
                engineVolume = 1.6;
            } this.engineVolume = engineVolume;

    //    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color == "") {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 40;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
    }

    public void requestDriverMechanicAndCarInformation(Car car, Driver driver, Mechanic mechanic) {
        System.out.println("Автомобилем " + car.getBrand() + " управляет водитель " + driver.getName() + ". К тс прикреплён механик " + mechanic.getName());
    }

    public void requestDriverMechanicAndCarInformation(Bus bus, Driver driver, Mechanic mechanic) {
        System.out.println("Автобусом " + bus.getBrand() + " управляет водитель " + driver.getName()+ ". К тс прикреплён механик " + mechanic.getName());
    }
    public void requestDriverMechanicAndCarInformation(Truck truck, Driver driver, Mechanic mechanic) {
        System.out.println("Грузовиком " + truck.getBrand() + " управляет водитель " + driver.getName()+ ". К тс прикреплён механик " + mechanic.getName());
    }
}
