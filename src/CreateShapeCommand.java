class CreateShapeCommand extends Command {
    public CreateShapeCommand(Shape shape) {
        super(shape);
    }


    @Override
    public void execute() {
        // Code pour créer une forme
        shape.draw();

    }
}

class MoveShapeCommand extends Command {
    private int x;
    private int y;

    public MoveShapeCommand(Shape shape, int x, int y) {
        super(shape);
        this.x = x;
        this.y = y;
        shape.printCoordinates();
    }

    @Override
    public void execute() {
        // Code pour déplacer une forme

        /*shape.setX(x);
        shape.setY(y);
        shape.printCoordinates();
        System.out.println("____________________________________" );
        System.out.println("Shape is moved to (" + x + "," + y + ")");*/
        shape.move(this.x,this.y);

    }
}

class DeleteShapeCommand extends Command {
    public DeleteShapeCommand(Shape shape) {
        super(shape);
    }

    @Override
    public void execute() {
        // Code pour supprimer une forme
        shape.delete();
    }
}
