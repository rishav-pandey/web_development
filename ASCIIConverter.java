public class ASCIIConverter {
    public static String convertToASCII(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append((int) c);
            if (i != str.length() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "yams";
        System.out.println(convertToASCII(str)); // prints "121 97 109 115"
    }
}
