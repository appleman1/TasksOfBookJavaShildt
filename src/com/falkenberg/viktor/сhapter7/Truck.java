package com.falkenberg.viktor.сhapter7;

public class Truck extends TruckDemo{

    private  int cargocap; // грузоподъемность в фунтах

    Truck(int рassengers, int fuelcap, int mpg, int cargocap) {
        super(рassengers, fuelcap, mpg);
        this.cargocap = cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }

    public int getCargocap() {

        return cargocap;
    }
}
