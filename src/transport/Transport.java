package transport;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;


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



    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver
                     //                     String color,
//                     int year,
//                     String country,
//                     int maxSpeed
                    ) {
        if (brand==null || brand.isEmpty() || model==null || model.isEmpty()) {
            this.brand = "default";
            this.model = "default";

        } else {
            this.brand = brand;
            this.model = model;
        }
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
    public abstract void printInfo ();
    public abstract void startMove ();
    public abstract void finishMove ();

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
}
