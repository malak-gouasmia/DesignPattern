import java.util.ArrayList;

abstract class ShapeComponent {
   protected String type;
    protected int x;
    protected int y;
    protected ArrayList<Shape> children;

    public ShapeComponent(String type) {
        this.type = type;
        this.children = new ArrayList<Shape>();
    }

    public abstract void draw();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addChild(Shape child) {
        children.add(child);
    }

    public void removeChild(ShapeComponent child) {
        children.remove(child);
    }

    public Shape getChild(int index) {
        return children.get(index);
    }
}