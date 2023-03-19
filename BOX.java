import java.util.Scanner;

public class BOX {
    Scanner in = new Scanner(System.in);
    public int length, height, width;

    class demo {
        demo() {
            System.out.print("Enter length : ");
            length = in.nextInt();
            System.out.print("Enter width : ");
            width = in.nextInt();
            System.out.print("Enter height : ");
            height = in.nextInt();
        }

        void volume() {
            System.out.println("Volume : " + (length * width * height));
        }
    }

    public static void main(String[] args) {
        BOX.demo obj = new BOX().new demo();
        obj.volume();
    }
}