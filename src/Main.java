public class Main {
    public static void main(String[] args) {
        TwoDShape[] list = {new Circle(5.0), new Triangle(1.0, 1.0, 1.0)};

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i].getArea());
            System.out.println(list[i].toString());
        }
    }
}