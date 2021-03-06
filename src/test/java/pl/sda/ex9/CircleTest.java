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

        MoveDirection md = new MoveDirection(2.5d, -3d);
        circle.move(md);
        assertEquals(2.5d,circle.getCenter().getX());
        assertEquals(-2d,circle.getPoint().getY());
    }

    @Test
    public void testRightCharacteristicsAfterResize(){
        Point2D center = new Point2D(0, 0 );
        Point2D point = new Point2D(0, 1 );
        Circle circle = new Circle(center, point);
        double r = circle.getRadius();

        assertEquals(1.0d, r);
        assertEquals(2*Math.PI*r, circle.getPerimeter());
        assertEquals(Math.PI*r*r, circle.getArea());
        System.out.println("r: " + r + "p: " + circle.getPerimeter() + "a: " + circle.getArea());

        //poprawić!!
        circle.resize(3.0d);
        r = circle.getRadius();
        assertEquals(3.0d, r);
        assertEquals(2*Math.PI*r,circle.getPerimeter());
        assertEquals(Math.PI*r*r,circle.getArea());
        System.out.println("r: " + r + "p: " + circle.getPerimeter() + "a: " + circle.getArea());
    }
}
