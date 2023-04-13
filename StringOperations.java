import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Change case of the first string
        String str1LowerCase = str1.toLowerCase();
        String str1UpperCase = str1.toUpperCase();
        System.out.println("Lowercase of first string: " + str1LowerCase);
        System.out.println("Uppercase of first string: " + str1UpperCase);

        // Reverse the first string
        String str1Reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed first string: " + str1Reversed);

        // Compare two strings
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the two strings equal? " + areEqual);

        // Insert one string into another string
        System.out.print("Enter a string to insert: ");
        String toInsert = scanner.nextLine();

        System.out.print("Enter the position to insert at: ");
        int position = scanner.nextInt();

        String str1WithInsertion = str1.substring(0, position) + toInsert + str1.substring(position);
        System.out.println("First string with insertion: " + str1WithInsertion);

        scanner.close();
    }
}
