
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import mechanics.Mechanic;
import transport.*;

import java.util.*;

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

        Car car1 = new Car("BMW", "Z8", 3.8, BodyType.COUPE, new DriverB("Jim", true, 5),new Mechanic("Алексей Петров", "компания А", true, true, false));
        Car car2 = new Car("Lada", "Granta", 1.7, BodyType.SEDAN, new DriverB("Kim", true, 7), new Mechanic("Валерий Леонтьев", "компания С", true, false, true));
        Car car3 = new Car("Audi ", "A8", 3.0, BodyType.COUPE, new DriverB("Alex", true, 3), new Mechanic("Максим Максимов", "компания Х", true, true, true));
        Car car4 = new Car("Kia", "Sportage", 2.4, BodyType.CROSSOVER, new DriverB("John", true, 9), new Mechanic("Алексей Петров", "компания А", true, true, false));
//        System.out.println("Водитель " + car1.getDriver().getName() + " управляет автомобилем " + car1.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + car2.getDriver().getName() + " управляет автомобилем " + car2.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + car3.getDriver().getName() + " управляет автомобилем " + car3.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + car4.getDriver().getName() + " управляет автомобилем " + car4.getBrand() + " и будет участвовать в заезде");


        Truck truck1 = new Truck("MAN", "1", 13.0, LoadCapacity.N3, new DriverC("George", true, 9), new Mechanic("Иван Иванов", "компания В", false, true, true));
        Truck truck2 = new Truck("VOLVO", "1", 15.0, LoadCapacity.N1, new DriverC("Ashley", true, 7), new Mechanic("Иван Иванов", "компания В", false, true, true));
        Truck truck3 = new Truck("Hyundai", "1", 16.0, LoadCapacity.N3, new DriverC("Michel", true, 23), new Mechanic("Максим Максимов", "компания Х", true, true, true));
        Truck truck4 = new Truck("Mercedes", "1", 14.0, LoadCapacity.N2, new DriverC("Mike", true, 12), new Mechanic("Валерий Леонтьев", "компания С", true, false, true));
//        System.out.println("Водитель " + truck1.getDriver().getName() + " управляет автомобилем " + truck1.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + truck2.getDriver().getName() + " управляет автомобилем " + truck2.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + truck3.getDriver().getName() + " управляет автомобилем " + truck3.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + truck4.getDriver().getName() + " управляет автомобилем " + truck4.getBrand() + " и будет участвовать в заезде");

        Bus bus1 = new Bus("Scania", "2", 10.4, Seats.EXTRABIG, new DriverD("Karl", true, 12), new Mechanic("Алексей Петров", "компания А", true, true, false));
        Bus bus2 = new Bus("VOLVO", "2", 13.0, Seats.MEDIUM, new DriverD("Geil", true, 11), new Mechanic("Иван Иванов", "компания В", false, true, true));
        Bus bus3 = new Bus("Hyundai", "2", 15.0, Seats.SMALL, new DriverD("Max", true, 8), new Mechanic("Максим Максимов", "компания Х", true, true, true));
        Bus bus4 = new Bus("MAN", "2", 11.6, Seats.EXTRASMALL, new DriverD("Antony", true, 20), new Mechanic("Денис Сидоров", "компания О", true, true, false));
//        System.out.println("Водитель " + bus1.getDriver().getName() + " управляет автомобилем " + bus1.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + bus2.getDriver().getName() + " управляет автомобилем " + bus2.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + bus3.getDriver().getName() + " управляет автомобилем " + bus3.getBrand() + " и будет участвовать в заезде");
//        System.out.println("Водитель " + bus4.getDriver().getName() + " управляет автомобилем " + bus4.getBrand() + " и будет участвовать в заезде");

//        Transport.startDiagnostics(car1, car2, car3, car4,
//                truck1, truck2, truck3, truck4,
//                bus1, bus2, bus3, bus4);
//        Driver.checkLicence(bus1.getDriver(), bus2.getDriver(), bus3.getDriver(), bus4.getDriver(),
//                car1.getDriver(), car2.getDriver(), car3.getDriver(), car4.getDriver(),
//                truck1.getDriver(), truck2.getDriver(), truck3.getDriver(), truck4.getDriver());
    //spisok avto
        ArrayList <Transport> participants = new ArrayList<Transport>();
        participants.add(car1);
        participants.add(car2);
        participants.add(car3);
        participants.add(car4);
        participants.add(bus1);
        participants.add(bus2);
        participants.add(bus3);
        participants.add(bus4);
        participants.add(truck1);
        participants.add(truck2);
        participants.add(truck3);
        participants.add(truck4);

        Mechanic mechanic1 = new Mechanic("Алексей Петров", "компания А", true, true, false);
        Mechanic mechanic2 = new Mechanic("Иван Иванов", "компания В", false, true, true);
        Mechanic mechanic3 = new Mechanic("Валерий Леонтьев", "компания С", true, false, true);
        Mechanic mechanic4 = new Mechanic("Максим Максимов", "компания Х", true, true, true);
        Mechanic mechanic5 = new Mechanic("Денис Сидоров", "компания О", true, true, false);


        ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);
        mechanics.add(mechanic5);
        System.out.println(mechanics);

        car1.requestDriverMechanicAndCarInformation(car1, car1.getDriver(), car1.getMechanic());
        car2.requestDriverMechanicAndCarInformation(car2, car2.getDriver(), car2.getMechanic());
        car3.requestDriverMechanicAndCarInformation(car3, car3.getDriver(), car3.getMechanic());
        car4.requestDriverMechanicAndCarInformation(car4, car4.getDriver(), car4.getMechanic());
        bus1.requestDriverMechanicAndCarInformation(bus1, bus1.getDriver(), bus1.getMechanic());
        bus2.requestDriverMechanicAndCarInformation(bus2, bus2.getDriver(), bus2.getMechanic());
        bus3.requestDriverMechanicAndCarInformation(bus3, bus3.getDriver(), bus3.getMechanic());
        bus4.requestDriverMechanicAndCarInformation(bus4, bus4.getDriver(), bus4.getMechanic());
        truck1.requestDriverMechanicAndCarInformation(truck1, truck1.getDriver(),truck1.getMechanic());
        truck2.requestDriverMechanicAndCarInformation(truck2, truck2.getDriver(), truck2.getMechanic());
        truck3.requestDriverMechanicAndCarInformation(truck3, truck3.getDriver(), truck3.getMechanic());
        truck4.requestDriverMechanicAndCarInformation(truck4, truck4.getDriver(), truck4.getMechanic());

        Queue <Transport> list = new LinkedList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(truck1);
        list.add(truck2);
        list.add(truck3);
        list.add(truck4);
        for (Transport transport : list) {
            System.out.println(transport.getBrand() + " тех. обслуживание пройдено");
        }        Transport transport = list.remove ();


        Map<Transport, Mechanic> mechAndHisTs = new HashMap<>();
        mechAndHisTs.put (car1, car1.getMechanic());
        mechAndHisTs.put (car2, car2.getMechanic());
        mechAndHisTs.put (car3, car3.getMechanic());
        mechAndHisTs.put (car4, car4.getMechanic());
        mechAndHisTs.put (bus1, bus1.getMechanic());
        mechAndHisTs.put (bus2, bus2.getMechanic());
        mechAndHisTs.put (bus3, bus3.getMechanic());
        mechAndHisTs.put (bus4, bus4.getMechanic());
        mechAndHisTs.put (truck1, truck1.getMechanic());
        mechAndHisTs.put (truck2, truck2.getMechanic());
        mechAndHisTs.put (truck3, truck3.getMechanic());
        mechAndHisTs.put (truck4, truck4.getMechanic());

        HashMap<Transport, Mechanic> duplicatMechAndHisTs = new HashMap<>();

        Set<Map.Entry<Transport, Mechanic>> entrySet = mechAndHisTs.entrySet();
        Iterator<Map.Entry<Transport, Mechanic>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Transport, Mechanic> entry = iterator.next();
            Transport key = entry.getKey();
            Mechanic value = entry.getValue();
            if(duplicatMechAndHisTs.containsKey(value)) {
                duplicatMechAndHisTs.put(key, duplicatMechAndHisTs.get(value));
            } else {
                duplicatMechAndHisTs.put(key, value);
            }
        }
        System.out.println(duplicatMechAndHisTs);


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

//    public static void startDiagnostics (Transport... transports) {
//        for (Transport transport : transports){
//            try {
//                transport.startDiagnostics();
//            } catch (UnsupportedOperationException e) {
//                System.out.println("Ошибка.");
//                System.out.println(e.getMessage());
//            } catch (CantStartDiagnosticsException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}