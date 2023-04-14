import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    // When radius = 0
    // When radius > 0

    @Test
    public void CircleArea(){
        Circle circle = new Circle(0);
        Circle circle2 = new Circle(24);
        assertEquals(0 * 0 * Math.PI, circle.getArea());
        assertEquals(24 * 24 * Math.PI, circle2.getArea());
    }
}