package com.falkenberg.viktor.сhapter7;

public class TruckDemo {
    private int passengers; // количество пассажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getPassengers() {

        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    // Это конструктор класса
    TruckDemo(int рassengers, int fuelcap, int mpg) {
        this.passengers = рassengers;
        this.fuelcap = fuelcap;

        this.mpg = mpg;
    }

    // Определить дальность поездки транспортного средства
    double range() {
        return mpg * fuelcap;
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(double miles) {
        return miles / mpg;
    }
}
