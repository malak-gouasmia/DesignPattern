class RectangleFactory extends ShapeFactory {
    public RectangleFactory(String type) {
        super(type);
    }

    public Shape createShape(String type) {
        return new Rectangle();
    }

    
}
