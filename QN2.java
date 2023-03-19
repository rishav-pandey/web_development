import java.util.*;

public class QN2 {
    static int substract(int a, int b) {
        return a - b;
    }

    static float substract(float a, float b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Substraction of 2 integers : " + substract(a, b));
        System.out.println("Enter 2 floats : ");
        float c = in.nextFloat();
        float d = in.nextFloat();
        System.out.println("Substraction of 2 integers : " + substract(c, d));
        in.close();

    }

}