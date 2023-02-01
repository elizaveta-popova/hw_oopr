package mechanics;

import transport.Bus;
import transport.Car;
import transport.Truck;

public class Mechanic {
    private final String name;
    private String company;
    private boolean repairsCars;
    private boolean repairsBuses;
    private boolean repairsTrucks;

    public Mechanic(String name,
                    String company,
                    boolean repairsCars,
                    boolean repairsBuses,
                    boolean repairsTrucks) {
        this.name = name;
        this.company = company;
        this.repairsCars = repairsCars;
        this.repairsBuses = repairsBuses;
        this.repairsTrucks = repairsTrucks;
    }

    public void perfomService (Car car, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " проводит техобслуживание машины " + car.getBrand() + car.getModel() + ".");
    }
    public void perfomService (Truck truck, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " проводит техобслуживание грузовика " + truck.getBrand() + truck.getModel() + ".");
    }
    public void perfomService (Bus bus, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " проводит техобслуживание автобуса " + bus.getBrand() + bus.getModel() + ".");
    }

    public void repair (Car car, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " чинит машину " + car.getBrand() + car.getModel() + ".");
    }
    public void repair (Truck truck, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " чинит грузовик " + truck.getBrand() + truck.getModel() + ".");
    }
    public void repair (Bus bus, Mechanic mechanic) {
        System.out.println("Маханик по имени " + name + " чинит автобус " + bus.getBrand() + bus.getModel() + ".");
    }





    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isRepairsCars() {
        return repairsCars;
    }

    public void setRepairsCars(boolean repairsCars) {
        this.repairsCars = repairsCars;
    }

    public boolean isRepairsBuses() {
        return repairsBuses;
    }

    public void setRepairsBuses(boolean repairsBuses) {
        this.repairsBuses = repairsBuses;
    }

    public boolean isRepairsTrucks() {
        return repairsTrucks;
    }

    public void setRepairsTrucks(boolean repairsTrucks) {
        this.repairsTrucks = repairsTrucks;
    }
}
