package oop.ocp;

public class Ellipse extends Shape {
    private double majorAxis , minorAxis;
    private static final double DEFAULT_MAJORAXIS = 1.0;
    private static final double DEFAULT_MINORAXIS = 1.0;

    //Getter and setter for Major Axis
    public double getMajorAxis() {
        return majorAxis;
    }
    public void setMajorAxis(double majorAxis){
        this.majorAxis = majorAxis;
    }

    //Getter and setter for Minor Axis
    public double getMinorAxis(){
        return minorAxis;
    }
    public void setMinorAxis(double majorAxis){
        this.minorAxis = minorAxis;
    }


    //Construct with custom values
    public Ellipse(double majorAxis , double minorAxis){
        this.setMajorAxis(majorAxis);
        this.setMinorAxis(minorAxis);
    }

    //Default constructor (sets default axes to 1.0)
    public Ellipse(){
        this(DEFAULT_MAJORAXIS , DEFAULT_MINORAXIS);
    }

    //Ellipse formula
    @Override
    public double getArea(){
        return Math.PI * this.majorAxis * this.minorAxis;
    }

}
