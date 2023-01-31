package transport;

public class DriverC extends Driver{
    public DriverC(String name, boolean licence, int grade) {
        super(name, licence, grade);
    }

    @Override
    public void checkLicence() throws LicenceException {

    }

    @Override

    public void startMove() {
        System.out.println("Водитель категории C " + getName() + "начал движение.");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + "закончил движение.");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getName() + "заправляет авто.");
    }

    @Override
    public void checkLicence(boolean licence) throws LicenceException {

    }
}
