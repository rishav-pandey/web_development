import java.util.Scanner;

public class lab5q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array contents:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] occurrences = new int[size];
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            occurrences[i] = count;
        }

        System.out.println("Element\tOccurrences");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i] + "\t" + occurrences[i]);
            }
        }
    }
}
