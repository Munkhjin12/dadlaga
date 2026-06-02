package com.example;


import java.util.Scanner;


public class Cube {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Кубын ирмэгийн уртыг оруулна уу: ");
       int num = sc.nextInt();
       
       
       int v = num * num * num;
       int Area = 4 * (num * num);
       
       
       System.out.println("Кубын эзэлхүүн: " + v);
       System.out.println("Кубын хажуу гадаргуугийн талбай: " + Area);
       
       sc.close();
    }
}       

