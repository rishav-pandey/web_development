import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = Sc.nextDouble();
        System.out.println("Area of the circle is : " + area(radius));
        System.out.print("Enter the sides of the triangle : ");
        int length = Sc.nextInt();
        int breadth = Sc.nextInt();
        System.out.println("Area of the triangle is : " + area(length, breadth));
        System.out.print("Enter the side of the square : ");
        int squareSide = Sc.nextInt();
        System.out.println("Area of the square is : " + area(squareSide));

    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(int lenght, int breadth) {
        return 0.5 * lenght * breadth;
    }

    public static int area(int side) {
        return side * side;
    }
}