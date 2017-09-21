package com.falkenberg.viktor.сhapter7;

public class Main {
    public static void main(String args[]) {
// Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println("Гpyзoвик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + "миль грузовику требуется " + gallons + " галлонов топлива.\n");
        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикaп может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}
