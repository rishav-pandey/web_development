import java.util.Scanner;

public class lab5q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter the cell values of a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        int rightDiagonalSum = 0;
        for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
            rightDiagonalSum += matrix[i][j];
        }

        System.out.println("Left diagonal sum: " + leftDiagonalSum);
        System.out.println("Right diagonal sum: " + rightDiagonalSum);
    }
}
