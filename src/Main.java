import transport.Car;

public class Main {

    static Car[] cars = new Car[5];

    public static void main(String[] args){

        cars[0] = new Car("LADA", "Granta", 1.7f,
                "", 2015, "Россия", "МКПП",
                "Cедан", "1111", "5");
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "Черный",2020,"Германия", "АКПП",
                "Седан", "2222", "5");
        cars[2] = new Car("BMW", "Z8", 3.0f,
                "Черный", 2021, "Германия", "AWD",
                "Хечбек", "3333", "2");
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4f,
                "Красный", 2018, "Южная Корея", "Tiptronic",
                "Внедоражник", "4444", "5");
        cars[4] = new Car("Hyundai", "Avante", 1.6f,
                "Оранжевый", 2016, "Южная Корея", "МКПП",
                "Универсал", "5555", "5");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }

}