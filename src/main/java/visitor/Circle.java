package visitor;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
