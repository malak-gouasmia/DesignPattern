
class Circle extends Shape {
    float rayon;
    public Circle() {
        super("Circle");
    }
    public void setR(float R) {
        this.rayon = R;
    }
    @Override
    public void draw() {
        System.out.println("____________________________________________" );
        System.out.println("  Drawing a Circle at (" + x + "," + y + ")  Rayon: "+ rayon +" cm" );
        System.out.println("____________________________________________" );
    }

    public void drawComposit() {
        System.out.println("____________________________________________" );
        System.out.println("  Circle at (" + x + "," + y + ")  Rayon: "+ rayon +" cm" );
        System.out.println("____________________________________________\n" );
    }

    public void printCoordinates() {
        System.out.println("____________________________________________" );
        System.out.println("Circle coordinates : (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }

    public void move(int a , int b ) {
        this.setX(a);
        this.setY(b);
        System.out.println("____________________________________________" );
        System.out.println("Circle moved to :  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }
    public void delete() {
        System.out.println("____________________________________________" );
        System.out.println("Deleting Circle at :  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );

    }
}



