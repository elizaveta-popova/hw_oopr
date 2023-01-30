
import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car(
                "Lada",
                "Granta",
                "жёлтый",
                "Россия",
                110,
                1.7,
                2015,
                "МКПП",
                "седан",
                "а123пр444",
                5,
                true,
                new Car.Key(true, false));
        System.out.println(Lada);
        Car Audi  = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                "чёрный",
                "Германия",
                150,
                3.0,
                2020,
                "АКПП",
                "купе",
                "р523пл664",
                2,
                true,
                new Car.Key(true,true));
        System.out.println(Audi);
        Car BMW = new Car("BMW ",
                "Z8",
                "чёрный",
                "Германия",
                140,
                3.0,
                2021,
                "АКПП",
                "купе",
                "в666вв666",
                2,
                true,
                new Car.Key(false, false));
        System.out.println(BMW);
        Car Kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                "красный",
                "Южная Корея",
                110,
                2.4,
                2018,
                "АКПП",
                "кроссовер",
                "п773пщ784",
                5,
                false,
                new Car.Key(true, true));
        System.out.println(Kia);
        Car Hyundai  = new Car(
                "Hyundai ",
                "Avante",
                "оранжевый",
                "Южная Корея",
                120,
                1.7,
                2016,
                "МКПП",
                "седан",
                "в523мм786",
                5,
                false,
                null);
        System.out.println(Hyundai);

        //buses
        for (int i = 0; i <= 3 ; i++) {
         Bus bus = new Bus(
                 "Bus brand №" + i,
                 "Bus model №" + i,
                 "Bus color №" + i,
                 2002 + i,
                 "USA",
                 120);
         System.out.println(bus);
        }


    }
}