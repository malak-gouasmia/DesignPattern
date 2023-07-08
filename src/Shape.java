abstract class Shape {
    protected String type;
    protected int x;
    protected int y;
    protected String name;

    public Shape(String type) {
        this.type = type;
    }

    public abstract void draw();

    public abstract void drawComposit();


    public abstract void printCoordinates();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void delete();

    public abstract void setR(float nextFloat);

    public abstract void move(int a, int b);
}
