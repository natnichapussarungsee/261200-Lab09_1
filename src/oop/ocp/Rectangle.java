package oop.ocp;

public class Rectangle extends Shape {

    private double width;
    private double height;
    private  static final double DEFAULT_WIDTH = 1.0;
    private static final double DEFAULT_HEIGHT = 1.0;

    //Getter for width.
    public double getWidth() {
        return width;
    }

    //Setter for width with validation.
    public void setWidth(double width){
        if(width > 0){
            this.width=width;
        }else
            this. width = DEFAULT_WIDTH;
    }

    //Getter for height.
    public double getHeight(){
        return height;
    }

    //Setter for height and validation.
    public void setHeight(double height){
        if(height > 0){
            this.height = height;
        }else
            this.height = DEFAULT_HEIGHT;
    }

    //Default constructor.
    public Rectangle() {this(DEFAULT_WIDTH, DEFAULT_HEIGHT);}

    //Constructor with parameters.
     public Rectangle (double width, double height){
         this.setWidth(width);
         this.setHeight(height);
        }

     //Rectangle formula : width * height.
    @Override
    public double getArea(){
        return this.width * this.height;
        }

}
