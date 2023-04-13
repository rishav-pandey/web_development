import java.util.Scanner;

public class OutOfRangeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        try {
            if (number < 10 || number > 50) {
                throw new Exception("Out of range");
            } else {
                int square = number * number;
                System.out.println("The square of " + number + " is " + square);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
