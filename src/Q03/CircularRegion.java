
import java.util.Scanner;

public class CircularRegion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input inner and outer radii
        System.out.print("Enter inner radius : ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius : ");
        double ro = scanner.nextDouble();

        // Create Circle objects
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute shaded area
        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        // Print the result
        System.out.println("Shaded Area: " + shadedArea);

        scanner.close();
    }
}