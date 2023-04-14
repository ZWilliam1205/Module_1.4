import java.lang.Math;
public class Triangle extends TwoDShape implements Rotate{
    double side1;
    double side2;
    double side3;

    //Default Constructors
    public Triangle(double width, double height) {
        super(width, height);
    }
    public Triangle(Colour Colour){super(Colour);}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // This method is used to calculate the Heron's height.
    private double heronsHeight() {
        return (side1 + side2 + side3)/2;
    }

    // This method is used to calculate the area of a triangle using Heron's formula.
    public double getArea() {
        double s = heronsHeight();
        return Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
    }
    // toString Method
    public String toString(){
        return "This is a triangle with side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + ".";
    }
    // The following method is used to alter the angle of the 2D Shape.
    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
