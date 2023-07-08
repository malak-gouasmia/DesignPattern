class SquareFactory extends ShapeFactory {
    public SquareFactory(String type) {
        super(type);
    }

    @Override
    public Shape createShape(String circle) {
        return new Square();
    }
}
