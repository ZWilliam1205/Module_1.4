import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

public class TriangleTest {
    // When the sides are all greater than 0
    // When the sides are equal
    // When the sides are 0
    // When the sides are 1.
    // When either the width or the height is 0

    @Test
    public void CircleArea(){
        Triangle T1 = new Triangle(1,1,1);
        Triangle T2 = new Triangle(0,0,0);
        Triangle T3 = new Triangle(30,20,10);
        Triangle T4 = new Triangle(30,0);

        assertEquals(Math.sqrt((1+1+1)/2 * ((1+1+1)/2 - 1)*((1+1+1)/2 - 1)*((1+1+1)/2 - 1)), T1.getArea());
        assertEquals(Math.sqrt((0+0+0)/2 * ((0+0+0)/2 - 1)*((0+0+0)/2 - 1)*((0+0+0)/2 - 1)), T2.getArea());
        assertEquals(Math.sqrt((30+20+10)/2 * ((30+20+10)/2 - 1)*((30+20+10)/2 - 1)*((30+20+10)/2 - 1)), T3.getArea());
        assertEquals(0.5 * 30 * 0, T4.getArea());
    }

}