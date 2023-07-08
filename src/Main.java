/*public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory("Circle");
        Shape circle = shapeFactory.createShape("Circle");
        circle.setX(10);
        circle.setY(20);
        circle.draw();

        shapeFactory = new RectangleFactory("Rectangle");
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.setX(30);
        rectangle.setY(40);
        rectangle.draw();

        shapeFactory = new SquareFactory("Square");
        Shape square = shapeFactory.createShape("Square");
        square.setX(50);
        square.setY(60);
        square.draw();
//exemple pour utiliser les commandes
        Invoker invoker = new Invoker();

        MoveShapeCommand moveCircle = new MoveShapeCommand(circle, 100, 200);
        DeleteShapeCommand deleteCircle = new DeleteShapeCommand(circle);
        ShapeFactory shapeFactoryy = new CircleFactory("circle");

        Shape circlee = shapeFactoryy.createShape("circle");
        Command createCircle = new CreateShapeCommand(circlee);


        invoker.storeAndExecute(createCircle);
        invoker.storeAndExecute(moveCircle);


        invoker.storeAndExecute(deleteCircle);

    }

}*/
/*import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  int userChoice = input.nextInt();
        Invoker invoker = new Invoker();
        ShapeFactory shapeFactory = new CircleFactory("Circle");
        boolean exit = false;
        while (!exit) {
        System.out.println("1. Create Shape");
        System.out.println("2. Move Shape");
        System.out.println("3. Delete Shape");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
        case 1:
        System.out.print("Enter shape type (Circle, Rectangle, Square): ");
        String shapeType = input.next();
        Shape shape = shapeFactory.createShape(shapeType);
        System.out.print("Enter x coordinate: ");
        shape.setX(input.nextInt());
        System.out.print("Enter y coordinate: ");
        shape.setY(input.nextInt());
        invoker.storeAndExecute(new CreateShapeCommand(shape));
        break;
        case 2:
        System.out.print("Enter shape type (Circle, Rectangle, Square): ");
        shapeType = input.next();
        shape = shapeFactory.createShape(shapeType);
        System.out.print("Enter new x coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter new y coordinate: ");
        int y = input.nextInt();
        invoker.storeAndExecute(new MoveShapeCommand(shape, x, y));
        break;
        case 3:
        System.out.print("Enter shape type (Circle, Rectangle, Square): ");
        shapeType = input.next();
        shape = shapeFactory.createShape(shapeType);
        invoker.storeAndExecute(new DeleteShapeCommand(shape));
        break;
        case 4:
        exit = true;
        break;
default:
        System.out.println("Invalid choice. Please try again.");
        break;
        }
        }
        }
}*/
import java.util.Scanner;
import java.util.HashMap;

public class Main {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Invoker invoker = new Invoker();
    //ShapeFactory shapeFactory = new CircleFactory("Circle");
    HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
    boolean exit = false;
    while (!exit) {
       // System.clear;
        System.out.println("______________________________________________" );
        System.out.println("|1. Create Shape                              |");
        System.out.println("|2. Move Shape                                |");
        System.out.println("|3. Delete Shape                              |");
        System.out.println("|4. Combine two shapes into one               |");
        System.out.println("|5. Exit                                      |");
        System.out.println("|____________________________________________|" );
        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter shape type (Circle, Rectangle, Square): ");
                String shapeType = input.next();
                String shapeName;
                Shape shape = null;
                if(shapeType.equals("Circle") || shapeType.equals("Rectangle") || shapeType.equals("Square")) {

                System.out.print("Enter shape name: ");
                 shapeName = input.next();
                    switch (shapeType){
                    case "Circle":



                        ShapeFactory shapeFactory = new CircleFactory("Circle");
                        shape = new Circle();
                        System.out.print("Enter Circle's radius: ");
                        shape.setR(input.nextFloat());
                       // ShapeFactory shapeFactory = CircleFactory.createShape("Circle");
                        break;
                        case "Rectangle":

                            ShapeFactory shapeFactory2 = new RectangleFactory("Rectangle");
                            shape = new Rectangle();
                            System.out.print("Enter Rectangle's width: ");
                            ((Rectangle) shape).setW(input.nextFloat());
                            System.out.print("Enter Rectangle's length: ");
                            ((Rectangle) shape).setL(input.nextFloat());
                            break;
                        case "Square":

                            ShapeFactory shapeFactory3 = new SquareFactory("Square");
                            shape = new Square();
                            System.out.print("Enter Square's Diametre: ");
                            shape.setR(input.nextFloat());
                            break;
                        
                    }

              
                System.out.print("Enter x coordinate: ");
                   
                shape.setX(input.nextInt());
                System.out.print("Enter y coordinate: ");
                shape.setY(input.nextInt());


                shapeMap.put(shapeName, shape);
                invoker.storeAndExecute(new CreateShapeCommand(shape));}
                else {
                    System.out.println("Invalid shape type. Please try again.");
                }
                break;
            case 2:
                System.out.print("Enter shape name: ");
                shapeName = input.next();
                if(!shapeMap.containsKey(shapeName)) {
                    System.out.println("Shape does not exist.");
                    break;
                }
                shape = shapeMap.get(shapeName);
                System.out.print("Enter new x coordinate: ");
                int x = input.nextInt();
                System.out.print("Enter new y coordinate: ");
                int y = input.nextInt();
                invoker.storeAndExecute(new MoveShapeCommand(shape, x, y));
                break;
            case 3:
                System.out.print("Enter shape name: ");
                 shapeName = input.next();
                if (shapeMap.containsKey(shapeName)) {
                    shape = shapeMap.get(shapeName);
                    invoker.storeAndExecute(new DeleteShapeCommand(shape));
                    shapeMap.remove(shapeName);
                } else {
                    System.out.println("Shape with name '" + shapeName + "' does not exist.");
                }
                break;
            case 4:
                String shapeName1;
                System.out.print("Enter shape1 name: ");
                shapeName1 = input.next();
                if(!shapeMap.containsKey(shapeName1)) {
                    System.out.println("Shape does not exist.");
                    break;
                }
               Shape shape1 = shapeMap.get(shapeName1);
                String shapeName2;

                System.out.print("Enter shape2 name: ");
                shapeName2 = input.next();
                Shape shape2 = shapeMap.get(shapeName2);
                if(!shapeMap.containsKey(shapeName1)) {
                    System.out.println("Shape does not exist.");
                    break;
                }

                CompositeShape compositeShape = new CompositeShape("CompositeShape");
                //Shape rectangle = new Rectangle();
                //Shape circle = new Circle();

                compositeShape.addChild(shape2);
                compositeShape.addChild(shape1);
                compositeShape.draw();
                               break;

            case 5:
                exit = true;
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;


        }
    }
}}
