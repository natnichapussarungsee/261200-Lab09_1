package oop.ocp;

//Closed for modification
//If you have new shape, this class still works! (no changes need)
public class AreaCalculator {
    public static double calculatorArea(Shape shape){
        return shape.getArea();
    }
}
