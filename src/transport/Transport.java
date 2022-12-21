package transport;

public class Transport {
    private final String brand;

    public String getBrand() {
        return brand;
    }

    private final String model;

    public String getModel() {
        return model;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private final int year;

    public int getYear() {
        return year;
    }

    private final String productionCountry;

    public String getProductionCountry() {
        return productionCountry;
    }

    private Integer maxSpeed;

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Transport(String brand, String model, String color, int year, String productionCountry, Integer maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        } else this.brand = brand;

        if (model == null ||model.isEmpty() || model.isBlank()){
            this.model = "default";
        } else this.model = model;

        if (color == null || color.isEmpty() || color.isBlank()){
            this.color = "Белый";
        } else this.color = color;

        if (year <= 0){
            this.year = 2000;
        } else this.year = year;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()){
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;

        if (maxSpeed ==null && maxSpeed < 0){
            System.out.println("Некоретные данные");
        }else this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
