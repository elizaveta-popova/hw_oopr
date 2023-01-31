
import transport.*;

public class Main {
    public static void main(String[] args) {
//        Car Lada = new Car(
//                "Lada",
//                "Granta",
//                "жёлтый",
//                "Россия",
//                110,
//                1.7,
//                2015,
//                "МКПП",
//                "седан",
//                "а123пр444",
//                5,
//                true,
//                new Car.Key(true, false));
//        System.out.println(Lada);
//        Car Audi  = new Car(
//                "Audi",
//                "A8 50 L TDI quattro",
//                "чёрный",
//                "Германия",
//                150,
//                3.0,
//                2020,
//                "АКПП",
//                "купе",
//                "р523пл664",
//                2,
//                true,
//                new Car.Key(true,true));
//        System.out.println(Audi);
//        Car BMW = new Car("BMW ",
//                "Z8",
//                "чёрный",
//                "Германия",
//                140,
//                3.0,
//                2021,
//                "АКПП",
//                "купе",
//                "в666вв666",
//                2,
//                true,
//                new Car.Key(false, false));
//        System.out.println(BMW);
//        Car Kia = new Car(
//                "Kia",
//                "Sportage 4-го поколения",
//                "красный",
//                "Южная Корея",
//                110,
//                2.4,
//                2018,
//                "АКПП",
//                "кроссовер",
//                "п773пщ784",
//                5,
//                false,
//                new Car.Key(true, true));
//        System.out.println(Kia);
//        Car Hyundai  = new Car(
//                "Hyundai ",
//                "Avante",
//                "оранжевый",
//                "Южная Корея",
//                120,
//                1.7,
//                2016,
//                "МКПП",
//                "седан",
//                "в523мм786",
//                5,
//                false,
//                null);
//        System.out.println(Hyundai);

        Car car1 = new Car("BMW", "Z8", 3.8, BodyType.COUPE, new DriverB("Jim", true, 5));
        Car car2 = new Car("Lada", "Granta", 1.7, BodyType.SEDAN, new DriverB("Kim", true, 7));
        Car car3 = new Car("Audi ", "A8", 3.0, BodyType.COUPE, new DriverB("Alex", true, 3));
        Car car4 = new Car("Kia", "Sportage", 2.4, BodyType.CROSSOVER, new DriverB("John", true, 9));
        System.out.println("Водитель " + car1.getDriver().getName() + " управляет автомобилем " + car1.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + car2.getDriver().getName() + " управляет автомобилем " + car2.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + car3.getDriver().getName() + " управляет автомобилем " + car3.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + car4.getDriver().getName() + " управляет автомобилем " + car4.getBrand() + " и будет участвовать в заезде");


        Truck truck1 = new Truck("MAN", "1", 13.0, LoadCapacity.N3, new DriverC("George", true, 9));
        Truck truck2 = new Truck("VOLVO", "1", 15.0, LoadCapacity.N1, new DriverC("Ashley", true, 7));
        Truck truck3 = new Truck("Hyundai", "1", 16.0, LoadCapacity.N3, new DriverC("Michel", true, 23));
        Truck truck4 = new Truck("Mercedes", "1", 14.0, LoadCapacity.N2, new DriverC("Mike", true, 12));
        System.out.println("Водитель " + truck1.getDriver().getName() + " управляет автомобилем " + truck1.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + truck2.getDriver().getName() + " управляет автомобилем " + truck2.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + truck3.getDriver().getName() + " управляет автомобилем " + truck3.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + truck4.getDriver().getName() + " управляет автомобилем " + truck4.getBrand() + " и будет участвовать в заезде");

        Bus bus1 = new Bus("Scania", "2", 10.4, Seats.EXTRABIG, new DriverD("Karl", true, 12));
        Bus bus2 = new Bus("VOLVO", "2", 13.0, Seats.MEDIUM, new DriverD("Geil", true, 11));
        Bus bus3 = new Bus("Hyundai", "2", 15.0, Seats.SMALL, new DriverD("Max", true, 8));
        Bus bus4 = new Bus("MAN", "2", 11.6, Seats.EXTRASMALL, new DriverD("Antony", true, 20));
        System.out.println("Водитель " + bus1.getDriver().getName() + " управляет автомобилем " + bus1.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + bus2.getDriver().getName() + " управляет автомобилем " + bus2.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + bus3.getDriver().getName() + " управляет автомобилем " + bus3.getBrand() + " и будет участвовать в заезде");
        System.out.println("Водитель " + bus4.getDriver().getName() + " управляет автомобилем " + bus4.getBrand() + " и будет участвовать в заезде");

//        for (int i = 0; i <= 4 ; i++) {
//            DriverD driverD = new DriverD("Driver cat.D №" + i, true, 5+i);
//         Bus bus = new Bus(
//                 "Bus brand №" + i,
//                 "Bus model №" + i,
//                 5.0,
//                 driverD);
//         DriverB driverB = new DriverB("Driver cat.B №" + i, true, 7+1);
//        Car car = new Car(
//                "Car brand №" + i,
//                "Car model №" + i,
//                2.0,
//                driverB);
//        DriverC driverC = new DriverC("Driver cat.C №" + i, true, 5+i);
//        Truck truck = new Truck(
//            "Truck brand №" + i,
//            "Truck model №" + i,
//            7.0,
//                driverC);
//         printInfo(car);
//         printInfo(truck);
//         printInfo(bus);
//        }
//
//        }
//        private static void printInfo (Transport<?> transport) {
//            System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
 }
    private static void printType (Transport <?> transport) {
        System.out.println(transport);
        if (transport == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}