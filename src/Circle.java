public class Circle extends TwoDShape{
    // field
    public final double PI = Math.PI;
    private double radius;
    // Default Constructors
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(Colour Colour){super(Colour);}

    // getArea and toString Method
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public String toString(){
        return "This is a circle with radius " + radius + ".";
    }
}
