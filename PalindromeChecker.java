import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove all whitespace and convert to lowercase
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
