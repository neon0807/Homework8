public class Main {

    static Car[] cars = new Car[5];

    public static void main(String[] args){

        cars[0] = new Car("LADA", "Granta", 1.7f,
                "Желтый", 2015, "Россия");
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "Черный",2020,"Германия");
        cars[2] = new Car("BMW", "Z8", 3.0f,
                "Черный", 2021, "Германия");
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4f,
                "Красный", 2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6f,
                "Оранжевый", 2016, "Южная Корея");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

}