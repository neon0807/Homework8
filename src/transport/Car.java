package transport;

import java.time.LocalDate;

public class Car {

    private static class Key{
        private boolean remoteEngineStart;
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        private boolean keylessAccess;
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess){

        }
    }

    private final String brand;
    public String getBrand() {
        return brand;
    }

    private final String model;
    public String getModel() {
        return model;
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

    private final int year;
    public int getYear() {
        return year;
    }

    private final String productionCountry;
    public String getProductionCountry() {
        return productionCountry;
    }

    private String transmission;
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    private final String bodyType;
    public String getBodyType() {
        return bodyType;
    }

    private String registrationNumber;
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private String numberOfSeats;
    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    private boolean typeOfRubber;

    public Car(String brand, String model, float engineVolume, String color,
               int year, String productionCountry, String transmission, String bodyType,
               String registrationNumber, String numberOfSeats){



        boolean typeOfRubber;

        if (LocalDate.now().getMonthValue() <= 2 || LocalDate.now().getMonthValue() == 12){
            this.typeOfRubber = true;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "default";
        } else this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()){
            this.bodyType = "default";
        } else this.bodyType = bodyType;

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
            this.registrationNumber = "default";
        } else this.registrationNumber = registrationNumber;

        if (numberOfSeats == null || numberOfSeats.isEmpty() || numberOfSeats.isBlank()){
            this.numberOfSeats = "default";
        } else this.numberOfSeats = numberOfSeats;



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

        public void changeRubber(){
            if (typeOfRubber){
                System.out.println("Сейчас зима, надо установить зимнии покрышки на колеса");
            } else System.out.println("Сейчас лето, надо установить летние покрышки на колеса ");
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
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats='" + numberOfSeats + '\'' +
                ", typeOfRubber=" + typeOfRubber +
                '}';
    }
}
