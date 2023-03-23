import java.util.*;

interface Motor {
    public void run();

    public void consume();
}

public class WashingMachine implements Motor {
    public void run() {
        System.out.println("The washing machine is now running.");
    }

    public void consume() {
        System.out.println("The washing machine is consuming power.");
    }

    public static void main(String[] args) {
        Motor obj = new WashingMachine();
        obj.run();
        obj.consume();
    }
}