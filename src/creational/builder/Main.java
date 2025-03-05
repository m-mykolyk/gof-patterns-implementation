package creational.builder;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new Car.CarBuilder()
                .setBrand("Porsche")
                .setModel("911")
                .setModelYear((short) 2025)
                .setEngineType("Gasoline")
                .setTransmissionType("Manual")
                .build();

        Car regularCar = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("RAV4")
                .setModelYear((short) 2025)
                .setEngineType("Hybrid")
                .setTransmissionType("Automatic")
                .build();

        sportCar.displayCar();
        regularCar.displayCar();
    }
}
