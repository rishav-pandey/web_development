import java.util.*;

public class Q5 {
    private int roll;
    private String name;
    private double cgpa;

    public Q5(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Q5[] students = new Q5[n];

        double minCgpa = Double.MAX_VALUE;
        String minCgpaStudentName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Q5(roll, name, cgpa);

            if (cgpa < minCgpa) {
                minCgpa = cgpa;
                minCgpaStudentName = name;
            }
        }

        System.out.println("Details of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Details for student " + (i + 1) + ":");
            students[i].display();
        }

        System.out.println("Student with lowest CGPA: " + minCgpaStudentName);
    }
}