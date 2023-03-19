import java.util.*;

public class Q7 {
    private int[] arr;
    private int n;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.print("Enter the number in array format : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void swap() {
        Arrays.sort(arr);
    }

    public void display() {
        System.out.println("Smallest number is " + arr[0]);
        System.out.println("Greatest number is " + arr[n - 1]);
    }

    public static void main(String[] args) {
        Q7 num = new Q7();
        num.read();
        num.swap();
        num.display();
    }
}
