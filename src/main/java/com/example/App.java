package com.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--- Cube Calculations ---" );
        
        Cube1 cube = new Cube1(3);
        Cube1 cube1 = new Cube1(4);
        Cube1 cube2 = new Cube1(10.5);

        System.out.println("Cube 1 (Side: " + cube.getSide() + "):");
        System.out.println("  Volume: " + cube.getVolume());
        System.out.println("  Surface Area: " + cube.getSurfaceArea());
        System.out.println("Cube 1 (Side: " + cube1.getSide() + "):");
        System.out.println("  Volume: " + cube1.getVolume());
        System.out.println("  Surface Area: " + cube1.getSurfaceArea());
        System.out.println("Cube 1 (Side: " + cube2.getSide() + "):");
        System.out.println("  Volume: " + cube2.getVolume());
        System.out.println("  Surface Area: " + cube2.getSurfaceArea());
    }
}