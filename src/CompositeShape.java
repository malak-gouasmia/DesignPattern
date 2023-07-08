
class CompositeShape extends ShapeComponent {

    public CompositeShape(String type) {
        super(type);

    }

    @Override
    public void draw() {
        int i=1;
        // implementation for drawing a composite shape
        // which includes drawing all its children
        System.out.println("CompositeShape: ");
        for (Shape child : children) {
            System.out.println("  Shape number " + i + " : ") ;
            i=i+1;
            child.drawComposit();
        }
    }

    public void addChild(Shape child) {
        children.add(child);
    }

}



