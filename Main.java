import java.util.Scanner;

class InvalidStringInputException extends Exception {
    InvalidStringInputException(String message) {
        super(message);
    }
}

public class lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter string " + (i + 1) + ": ");
                String str = scanner.nextLine();
                checkStringFormat(str);
                printAsciiCodes(str);
            } catch (InvalidStringInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void checkStringFormat(String str) throws InvalidStringInputException {
        if (str.length() % 2 != 0) {
            throw new InvalidStringInputException("String length must be even");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0 && !Character.isUpperCase(ch)) {
                throw new InvalidStringInputException("Even positions must be uppercase letters");
            }
            if (i % 2 != 0 && !Character.isLowerCase(ch)) {
                throw new InvalidStringInputException("Odd positions must be lowercase letters");
            }
        }
    }

    private static void printAsciiCodes(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println((int) str.charAt(i));
        }
    }
}