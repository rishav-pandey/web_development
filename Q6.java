import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double area = 0.0;

        do {
            System.out.println("Select a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.println("The area of the circle is " + area);
                    break;

                case 2:
                    System.out.print("Enter the side of the square: ");
                    double side = scanner.nextDouble();
                    area = side * side;
                    System.out.println("The area of the square is " + area);
                    break;

                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("The area of the triangle is " + area);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}