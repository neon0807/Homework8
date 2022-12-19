import java.util.Arrays;

public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private float engineVolume;

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String productionCountry;

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, float engineVolume, String color,
                int year, String productionCountry){

        if (brand == null || brand.isEmpty()){
            this.brand = "default";
        } else this.brand = brand;

        if (model == null ||model.isEmpty()){
            this.model = "default";
        } else this.model = model;

        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        } else this.engineVolume =engineVolume;

        if (color == null || color.isEmpty()){
            this.color = "Белый";
        } else this.color = color;

        if (year <= 0){
            this.year = 2000;
        } else this.year = year;

        if (productionCountry == null || productionCountry.isEmpty()){
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}
