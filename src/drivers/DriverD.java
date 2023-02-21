package drivers;

public class DriverD extends Driver {
    public DriverD(String name, boolean licence, int grade) {
        super(name, licence, grade);
    }

    @Override
    public void checkLicence() throws LicenceException {

    }

    public void startMove() {
        System.out.println("Водитель категории D " + getName() + "начал движение.");
    }



    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + "закончил движение.");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getName() + "заправляет авто.");
    }

    @Override
    public void checkLicence(boolean licence) throws LicenceException {

    }
}
