public abstract class TwoDShape {
    public double width;
    public double height;
    public Colour Colour;

    // Default Constructors
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        width = 0;
        height = 0;
    }

    public TwoDShape (Colour Colour){
        this.Colour = Colour;
    }

    /* this function is used to calculate the area of the 2d shape

     */
    public abstract double getArea();

    // Getters and Setters
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // toString method
    public abstract String toString();
}
