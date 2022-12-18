import java.util.Arrays;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String productionCountry;

    Car [] cars;

    public Car(String model, float engineVolume, String color, int year,String productionCountry){
        this.brand = "default";
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.productionCountry = productionCountry;
    }

    public Car(float engineVolume, String color, String brand, int year, String productionCountry){
        this.brand = brand;
        this.model = "default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, float engineVolume, int year, String productionCountry){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = "default";
        this.year = year;
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, float engineVolume, String color, int year){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.productionCountry = "default";
    }

    public Car(String brand, String model, float engineVolume, String color, int year,String productionCountry){
        if (brand.isEmpty()){
            this.brand = "default";
        } else this.brand = brand;
        if (model.isEmpty()){
            this.model = "default";
        } else this.model = model;
        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        } else this.engineVolume =engineVolume;
        if (color.isEmpty()){
            this.color = "Белый";
        } else this.color = color;
        if (year <= 0){
            year = 2000;
        } else this.year = year;
        if (productionCountry.isEmpty()){
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + brand + '\'' +
                ", Модель='" + model + '\'' +
                ", Объем двигателя=" + engineVolume +
                ", Цвет кузова='" + color + '\'' +
                ", Год выпуска=" + year +
                ", Страна сборки='" + productionCountry + '\'' +
                '}';
    }
}
