package visitor;

public interface Visitor {
    String visit(Circle circle);
    String visit(Rectangle rectangle);
}
