package transport;

public class Bus extends Transport <DriverD> {
    public Seats seats;

    @Override
    public void printType() {

    }

    public Bus(String brand, String model, double engineVolume, Seats seats, DriverD driver) {
        super(brand, model, engineVolume, driver);
        this.seats=seats;
    }

    @Override
    public void printInfo() {

    }

    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение.");
    }
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestCircleTime() {
        int min = 100;
        int max = 150;
        int bestTime = (int) (min + (max-min)*Math.random());
        System.out.println("Лучшее время круга для автобуса " + bestTime);

    }

    @Override
    public void maxSpeed() {
        int min = 80;
        int max = 120;
        int maxSpeed = (int) (min + (max-min)*Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);

    }

    //    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
//        super(brand, model, color, year, country, maxSpeed);
//    }
}
