public class lab5q6 {
    private static int counter = 0;

    public ObjectCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        System.out.println("Number of objects created: " + ObjectCounter.getCounter());
    }
}
