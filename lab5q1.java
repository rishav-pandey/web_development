import java.util.*;

public class lab5q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter three numbers : ");

        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            arr[0] = num1;

            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();
                arr[1] = num2;
                if (scanner.hasNextInt()) {
                    int num3 = scanner.nextInt();
                    arr[2] = num3;
                    System.out.println("The entered numbers are " + num1 + ", " + num2 + ", " + num3 + ".");
                } else {
                    System.out.println("Enter valid integer inputs.");
                }
            } else {
                System.out.println("Enter valid integer inputs.");
            }
        } else {
            System.out.println("Enter valid integer inputs.");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest number is " + max);
    }
}
