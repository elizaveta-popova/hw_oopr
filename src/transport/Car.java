package transport;

public class Car extends Transport <DriverB> {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void printInfo() {

    }

    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение.");
    }
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void bestCircleTime() {
        int min = 70;
        int max = 120;
        int bestTime = (int) (min + (max-min)*Math.random());
        System.out.println("Лучшее время круга для автомобиля " + bestTime);

    }

    @Override
    public void maxSpeed() {
        int min = 100;
        int max = 160;
        int maxSpeed = (int) (min + (max-min)*Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);

    }

    //polya
//    private double engineVolume;
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int seatsNumber;
//    private boolean summerTyre;
//
//    private Key key;
//
//    //noviy class
//    public static class Key {
//        private final boolean remoteStart;
//        private final boolean keylessAccess;
//
//        public boolean isRemoteStart() {
//            return remoteStart;
//        }
//
//        public boolean isKeylessAccess() {
//            return keylessAccess;
//        }
//
//        public Key(boolean remoteStart, boolean keylessAccess) {
//            this.remoteStart = remoteStart;
//            this.keylessAccess = keylessAccess;
//        }
//
//        @Override
//        public String toString() {
//            return (remoteStart?"удалённый запуск двигателя":"без удаленного запуска двигателя") + ". " +
//                    (keylessAccess?"бесключевой доступ":"бесключевой доступ отсутствует");
//        }
//    }
//
//    //constructor
//
//    public Car (String brand,
//                String model,
//                String color,
//                String country,
//                int maxSpeed,
//                double engineVolume,
//                int year,
//                String transmission,
//                String bodyType,
//                String registrationNumber,
//                int seatsNumber,
//                boolean summerTyre,
//                Key key) {
//        super(brand, model, color, year, country, maxSpeed);
//        setEngineVolume(engineVolume);
//        setTransmission(transmission);
//        if (bodyType==null || bodyType.isEmpty()){
//            bodyType = "седан";
//        }
//        this.bodyType=bodyType;
//        setRegistrationNumber(registrationNumber);
//        if (seatsNumber <= 0) {
//            seatsNumber = 5;
//        }
//        this.seatsNumber = seatsNumber;
//        this.summerTyre=summerTyre;
//        setKey(key);
//    }
//
//    //metod
//
//    public String toString () {
//        return super.toString() + ", " +
//                "Объем двигателя: " + engineVolume + " л. " +
//                "Коробка передач: " + transmission + ". " +
//                "Тип кузова: " + bodyType + ". " +
//                "Регистрационный номер: " + registrationNumber + ". " +
//                "Количество мест: " + seatsNumber + ". " +
//                (summerTyre ? "летняя":"зимняя") + " резина" + ". " +
//                key;
//    }
//    public void characteristics () {
//        System.out.println( );
//    }
//    public void changeTyres (int month) {
//        if ((month>=11 && month<=12) || (month>=1 && month<=3)) {
//            summerTyre = false;
//        }
//        if (month >=4 && month <=10) {
//            summerTyre = true;
//        }
//
//    }
//    //getter and setter
//
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            this.engineVolume = 1.5;
//        } else {
//            this.engineVolume = engineVolume;
//        }
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        if (transmission==null || transmission.isEmpty()) {
//            transmission = "МКПП";
//        }
//        this.transmission = transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber==null || registrationNumber.isEmpty()) {
//            registrationNumber = "х000хх000";
//        }
//        this.registrationNumber = registrationNumber;
//    }
//
//    public int getSeatsNumber() {
//        return seatsNumber;
//    }
//
//    public boolean getSummerTyre() {
//        return summerTyre;
//    }
//
//    public void setSummerTyre(boolean summerTyre) {
//        this.summerTyre = summerTyre;
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        if (key == null) {
//            key = new Key(false, false);
//        }
//        this.key = key;
//    }
}