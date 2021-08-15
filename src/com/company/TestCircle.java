package com.company;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);

        double radius = circle1.getRadius();
        double area = circle1.getArea();
        System.out.println(radius);
        System.out.println(area);

        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());


    }
}