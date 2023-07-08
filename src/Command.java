abstract class Command {
    protected Shape shape;

    public Command(Shape shape) {
        this.shape = shape;
    }

    public abstract void execute();
}
