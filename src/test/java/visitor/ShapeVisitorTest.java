package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeVisitorTest {

    @Test
    void shouldVisitCircle() {
        Circle circle = new Circle(10.0f);

        ShapeVisitor visitor = new ShapeVisitor();
        assertEquals("Circle { radius: 10.0 };", visitor.visit(circle));
    }

    @Test
    void shouldVisitRectanble() {
        Rectangle rectangle = new Rectangle(10.0f, 4.0f);

        ShapeVisitor visitor = new ShapeVisitor();
        assertEquals("Rectangle { width: 10.0, height: 4.0 };", visitor.visit(rectangle));
    }

}
