class Rectangle extends Shape {
 private float length;

    private float width;
    public Rectangle() {
        super("Rectangle");


    }

    public void draw() {

        System.out.println("  Drawing a Rectangle at (" + x + "," + y + ")  Length: "+ length +" cm & width:"+ width +" cm " );
    }
    public void drawComposit() {
        System.out.println("____________________________________" );
        System.out.println("Rectangle at (" + x + "," + y + ")  Length: "+ length +" cm & width:"+ width +" cm " );
        System.out.println("____________________________________" );
    }

    @Override
    public void printCoordinates() {
        System.out.println("____________________________________________" );
        System.out.println("Rectangle coordinates : (" + x + ", " + y + ")");

        System.out.println("____________________________________________\n" );
    }
    public void delete() {

        System.out.println("____________________________________________" );
        System.out.println("Deleting Rectangle at :  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );

    }


    public void move(int a , int b ) {
        this.setX(a);
        this.setY(b);
        System.out.println("____________________________________________" );
        System.out.println("Rectangle moved to :  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }

    @Override
    public void setR(float r) {

    }

    public void setL(float length) {
        this.length = length;

    }
    public void setW(float width) {

        this.width = width;
    }
}