import java.util.*;

public class ques6 {
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }

    public ques6() {
    }

    public ques6(int n) {
    }

    public ques6(String s) {
    }

    public static void main(String args[]) {
        ques6 t1 = new ques6();
        System.out.println(ques6.noOfObjects);
        ques6 t2 = new ques6(21051686);
        System.out.println(ques6.noOfObjects);
        ques6 t3 = new ques6("Shobhit Verma");
        System.out.println(ques6.noOfObjects);
    }
}