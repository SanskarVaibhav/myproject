import Recordpack.Circle;
import Recordpack.Square;
import Recordpack.Triangle;
import Recordpack.shape;
import java.util.Scanner;

public class testshape {
  
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape (Square, Triangle, Circle): ");
        String shape = sc.nextLine().toLowerCase();

        System.out.println("Enter the dimensions separated by space:");
        double dimension1 = sc.nextDouble();
        double dimension2 = sc.nextDouble();
        double dimension3 = sc.nextDouble();

        shape Shape = null;
        switch (shape) {
            case "square":
                Shape = new Square(dimension1);
                break;
            case "triangle":
                Shape = new Triangle(dimension1, dimension2, dimension3);
                break;
            case "circle":
                Shape = new Circle(dimension1);
                break;
            default:
                System.out.println("Invalid shape.");
                return;
        }

        System.out.printf("Area: %.2f%n", Shape.area());
        System.out.printf("Perimeter: %.2f%n", Shape.perimeter());
    }
}
