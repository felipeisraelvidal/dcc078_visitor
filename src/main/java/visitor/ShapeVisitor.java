package visitor;

public class ShapeVisitor implements Visitor {

    public String visit(Shape shape) {
        return shape.accept(this);
    }

    @Override
    public String visit(Circle circle) {
        return "Circle { radius: " + circle.getRadius() + " };";
    }

    @Override
    public String visit(Rectangle rectangle) {
        return "Rectangle { width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight() + " };";
    }
}
