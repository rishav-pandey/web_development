import java.util.Scanner;

public class lab5q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];

        System.out.println("Please enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenNumbers[evenCount] = num;
                    evenCount++;
                } else {
                    oddNumbers[oddCount] = num;
                    oddCount++;
                }
            } else {
                System.out.println("Invalid input, please enter an integer.");
                scanner.next();
                i--;
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Count of odd numbers: " + oddCount);
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }
}