package transport;

import java.time.LocalDate;

public class Car extends Transport {

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

    private class Insurance {
        private LocalDate ofvalidityPeriod;

        public LocalDate getOfvalidityPeriod() {
            return ofvalidityPeriod;
        }

        private Integer costInsurance;

        public Integer getCostInsurance() {
            return costInsurance;
        }

        private Integer numberInsurance;

        public Integer getNumberInsurance() {
            return numberInsurance;
        }

        public Insurance(LocalDate ofvalidityPeriod, Integer costInsurance, Integer numberInsurance) {
            this.ofvalidityPeriod = ofvalidityPeriod;
            this.costInsurance = costInsurance;
            this.numberInsurance = numberInsurance;
        }

        public void checkValidityPeriod(){
            if (ofvalidityPeriod.isBefore(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void chekNumberInsurance(){
            if (numberInsurance != null && numberInsurance > 99999999 && numberInsurance <1000000000){
                this.numberInsurance = numberInsurance;
            } else System.out.println("Номер страховки некорректный!");
        }
    }




//    private final String brand;
//    public String getBrand() {
//        return brand;
//    }
//
//    private final String model;
//    public String getModel() {
//        return model;
//    }

    private float engineVolume;
    public float getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

//    private String color;
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    private final int year;
//    public int getYear() {
//        return year;
//    }

//    private final String productionCountry;
//    public String getProductionCountry() {
//        return productionCountry;
//    }

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

    private boolean isWinter;

    public Car(String brand, String model, float engineVolume, String color,
               int year, String productionCountry, String transmission, String bodyType,
               String registrationNumber, String numberOfSeats, Integer maxSpeed){
        super(brand, model,color, year, productionCountry,maxSpeed);


        this.isWinter = isWinter;


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



//            if (brand == null || brand.isEmpty()){
//                    this.brand = "default";
//                } else this.brand = brand;
//
//            if (model == null ||model.isEmpty()){
//                    this.model = "default";
//                } else this.model = model;

            if (engineVolume <= 0){
                    this.engineVolume = 1.5f;
                } else this.engineVolume =engineVolume;

//            if (color == null || color.isEmpty()){
//                    this.color = "Белый";
//                } else this.color = color;
//
//            if (year <= 0){
//                    this.year = 2000;
//                } else this.year = year;
//
//            if (productionCountry == null || productionCountry.isEmpty()){
//                    this.productionCountry = "default";
//                } else this.productionCountry = productionCountry;
        }

        public void changeRubber() {
            if (!isWinter && LocalDate.now().getMonthValue() <= 2 || LocalDate.now().getMonthValue() == 12) {
                isWinter = true;
            }
        }
}
