class Square extends Shape {
    private float diametre;
    public Square() {
        super("Square");
    }

    @Override
    public void draw() {
        System.out.println("____________________________________________" );

        System.out.println("  Drawing a Square at (" + x + "," + y + ")  Diametre: "+ diametre +" cm" );
        System.out.println("____________________________________________" );
    }
    public void drawComposit() {
        System.out.println("____________________________________________" );

        System.out.println("   Square at (" + x + "," + y + ")  Diametre: "+ diametre +" cm" );
        System.out.println("____________________________________________" );
    }

    @Override
    public void printCoordinates() {
        System.out.println("____________________________________________" );
        System.out.println("Square coordinates : (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }

    public void delete() {
        System.out.println("____________________________________________" );

        System.out.println("Deleting Square at:  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }
    public void move(int a , int b ) {
        this.setX(a);
        this.setY(b);
        System.out.println("____________________________________________" );
        System.out.println("Square moved to :  (" + x + ", " + y + ")");
        System.out.println("____________________________________________\n" );
    }

    @Override
    public void setR(float diametre) {
        this.diametre = diametre;
    }
}
