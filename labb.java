
// Write a java program that asks the user to enter the elements of an array
// through command line arguments followed by printing the minimum element 
// along with the index where it is present in the array.
import java.util.Scanner;

class Array {

    static void displayMin(int[] arr) {
        int min = arr[0], ind = 0;
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
                ind = i;
            }
        System.out.println("Min element : " + min + " at index " + ind);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        displayMin(arr);
    }
}

//////

import java.util.Scanner;

public class QN5 {
    static int reverse(int a) {
        int rem, rev = 0;
        while (a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int rev = reverse(n);
        if (n == rev) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }
        input.close();
    }
}