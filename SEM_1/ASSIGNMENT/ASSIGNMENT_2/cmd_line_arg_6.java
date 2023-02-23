public class cmd_line_arg_6 {
	public static void main(String[] args) {
		String s = args[0];
		int ch = (char)s.charAt(0);
		System.out.println("The ASCII value of " + s + " is " + ch);
	}
}