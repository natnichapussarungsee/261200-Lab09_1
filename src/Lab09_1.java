import oop.ocp.AreaCalculator;
import oop.ocp.Circle;
import oop.ocp.Ellipse;
import oop.ocp.Rectangle;

void main(){

    System.out.println(AreaCalculator.calculatorArea(new Rectangle(5,4)));
    System.out.println(AreaCalculator.calculatorArea(new Circle(3)));
    System.out.println(AreaCalculator.calculatorArea(new Ellipse(6,2)));

    System.out.println("------------");
    System.out.println("------------");
    System.out.println("------------");

    System.out.println(AreaCalculator.calculatorArea(new Rectangle()));
    System.out.println(AreaCalculator.calculatorArea(new Circle(1)));
    System.out.println(AreaCalculator.calculatorArea(new Ellipse()));

}
