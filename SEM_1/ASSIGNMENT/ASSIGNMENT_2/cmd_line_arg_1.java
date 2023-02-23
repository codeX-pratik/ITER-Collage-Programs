public class cmd_line_arg_1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int q = a/b;
		int r = a%b;
		System.out.println("Quotient : " + q);
		System.out.println("Remainder : " + r);
	}
}
