public class P10 {
    public static void main(String[] args) {
        System.out.println(reverseString("pratik"));
    }

    public static String reverseString(String s) {
        if (s.length() <= 1 || s == null) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

}
