package pl.sda.ex9;

import org.junit.jupiter.api.Test;
import pl.sda.ex10.MoveDirection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testRightCharacteristics(){
        Point2D center = new Point2D(0, 0 );
        Point2D point = new Point2D(0, 1 );
        Circle circle = new Circle(center, point);
        double r = circle.getRadius();

        assertEquals(1.0d, r);
        assertEquals(2*Math.PI*r, circle.getPerimeter());
        assertEquals(Math.PI*r*r, circle.getArea());

        //sprawdzic test z kodem trenera
        MoveDirection md = new MoveDirection(2.5d, -3);
        circle.move(md);
        assertEquals(2.5d,circle.getCenter().getX());
        assertEquals(-2,circle.getCenter().getY());
    }
}
