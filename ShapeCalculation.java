import java.util.Scanner;

public class ShapeCalculation {

    private static double radius;
    private static double radius2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape: 1. Circle 2. Square 3. Triangle 4. Trapezium");
        int shape = scanner.nextInt();

        switch (shape) {
            case 1: {
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + meth(radius));
                System.out.println("Perimeter of circle: " + methPerimeter(radius));
                break;
            }
            case 2: {
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + meth(side));
                System.out.println("Perimeter of square: " + methPerimeter(side));
                break;
            }
            case 3: {
                System.out.println("Enter the base and height of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + meth(base, height));
                System.out.println("Perimeter of triangle: " + methPerimeter(base, height));
                break;
            }
            case 4: {
                System.out.println("Enter the top, bottom, and height of the trapezium:");
                double top = scanner.nextDouble();
                double bottom = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println("Area of trapezium: " + meth(top, bottom, height));
                System.out.println("Perimeter of trapezium: " + methPerimeter(top, bottom, height));
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }

    public static double meth(double radius) {
        ShapeCalculation.radius = radius;
        radius2 = radius;
        ShapeCalculation.radius = radius;
        return Math.PI * radius * radius;
    }

    public static double meth(int side) {
        return side * side;
    }

    public static double meth(double base, double height) {
        return 0.5 * base * height;
    }

    public static double meth(double top, double bottom, double height) {
        return 0.5 * (top + bottom) * height;
    }

    public static double methPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double methPerimeter(int side) {
        return 4 * side;
    }

    public static double methPerimeter(double base, double height) {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public static double methPerimeter(double top, double bottom, double height) {
        double a = Math.abs(top - bottom) / 2;
        double b = Math.sqrt(a * a + height * height);
        return top + bottom + 2 * b;
    }
}c