package creational.builder;

class Car {
    private final String brand;
    private final String model;
    private final short modelYear;
    private final String engineType;
    private final String transmissionType;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.modelYear = builder.modelYear;
        this.engineType = builder.engineType;
        this.transmissionType = builder.transmissionType;
    }

    public void displayCar() {
        System.out.println("Brand: " + brand
                + "\nModel: " + model
                + "\nModel year: " + modelYear
                + "\nEngine type: " + engineType
                + "\nTransmission type: " + transmissionType);
    }

    static class CarBuilder {
        private String brand;
        private String model;
        private short modelYear;
        private String engineType;
        private String transmissionType;

        CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        CarBuilder setModelYear(short modelYear) {
            this.modelYear = modelYear;
            return this;
        }

        CarBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        CarBuilder setTransmissionType(String transmissionType) {
            this.transmissionType = transmissionType;
            return this;
        }

        Car build() {
            return new Car(this);
        }
    }
}
