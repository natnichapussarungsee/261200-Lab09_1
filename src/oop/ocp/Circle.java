package oop.ocp;

public class Circle extends Shape{
    private double radius;

    //Set radius
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    //Circle formula
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

}
