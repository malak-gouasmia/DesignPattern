class CircleFactory extends ShapeFactory {
    public CircleFactory(String type) {
        super(type);
    }

    @Override
    public Shape createShape(String circle) {
        return new Circle();
    }
}
