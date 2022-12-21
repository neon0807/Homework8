import transport.Bus;
import transport.Car;

public class Main {

    static Car[] cars = new Car[5];
    static Bus[] bus = new Bus[3];

    public static void main(String[] args){

        cars[0] = new Car("LADA", "Granta", 1.7f,
                "", 2015, "Россия", "МКПП",
                "Cедан", "1111", "5", 170);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "Черный",2020,"Германия", "АКПП",
                "Седан", "2222", "5", 280);
        cars[2] = new Car("BMW", "Z8", 3.0f,
                "Черный", 2021, "Германия", "AWD",
                "Хечбек", "3333", "2", 320);
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4f,
                "Красный", 2018, "Южная Корея", "Tiptronic",
                "Внедоражник", "4444", "5", 200);
        cars[4] = new Car("Hyundai", "Avante", 1.6f,
                "Оранжевый", 2016, "Южная Корея", "МКПП",
                "Универсал", "5555", "5", 190);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        bus[0] = new Bus("Мерседес", "Спринтер", "Белый", 2019,
                "Германия", 190);
        bus[1] = new Bus("Фольксваген", "Крафтер", "Красный", 2017,
                "Германия", 195);
        bus[2] = new Bus("Форд", "Транзит", "Зеленый", 2015,
                "США", 170);
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }

    }

}