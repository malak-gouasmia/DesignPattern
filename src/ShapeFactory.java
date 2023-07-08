abstract class ShapeFactory {
    protected String type;

    public ShapeFactory(String type) {
        this.type = type;
    }

    public abstract Shape createShape(String type);
}
