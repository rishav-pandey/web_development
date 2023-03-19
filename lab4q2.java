import java.util.Scanner;

public class lab4q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks [out of 100]");
        int marks = input.nextInt();
        System.out.print("Grade : ");
        if (marks >= 90) {
            System.out.println("A-Excellent");
        } else if (marks >= 80) {
            System.out.println("B-Very good");
        } else if (marks >= 70) {
            System.out.println("C-Good");
        } else if (marks >= 60) {
            System.out.println("D-Satisfactory");
        } else if (marks >= 50) {
            System.out.println("E-Work Hard");
        } else if (marks >= 40) {
            System.out.println("F-Just Passed");
        } else {
            System.out.println("Failed");
        }
        input.close();
    }
}