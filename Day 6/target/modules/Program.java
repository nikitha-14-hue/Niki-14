package target.modules;
public class Program {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        shapes[0] = new Shape("red",true);
        shapes[1] = new Shape("blue",false);
        shapes[2] = new Square(3.0, "Green", true);
        shapes[3] = new Circle(3.5, "Yellow", false);
        shapes[4] = new Rectangle(6.0, 8.0, "Orange", true);
        shapes[5] = new Square(4.5, "Purple", false);
        shapes[6] = new Circle(7.0, "Pink", true);
        shapes[7] = new Rectangle(5.0, 7.0, "Cyan", false);
        shapes[8] = new Square(2.5, "Brown", true);
        shapes[9] = new Circle(6.5, "White", false);
        for (Shape sh : shapes) {
            if (sh instanceof Circle) {
                System.out.println("Circle area is " + ((Circle) sh).getArea());
                System.out.println(((Circle) sh).toString());
            } else if (sh instanceof Rectangle) {
                System.out.println("Rectangle area is " + ((Rectangle) sh).getArea());
                System.out.println(((Rectangle) sh).toString());
            }
            else if (sh instanceof Shape) {

                System.out.println(((Shape) sh).toString());
            } else if (sh instanceof Square) {
                System.out.println("Square area is " + ((Square) sh).getArea());
                System.out.println(((Square) sh).toString());
            }
        }
    }
}
