package com.example;

public class Cube1 {
    private double side;

    public Cube1(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getVolume() {
        return Math.pow(this.side, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(this.side, 2);
    }
}