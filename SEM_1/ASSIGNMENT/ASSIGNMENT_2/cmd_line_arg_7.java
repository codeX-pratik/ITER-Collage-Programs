public class cmd_line_arg_7 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		boolean r = (a <= (b * c) || b <= (a * c) || c <= (a * b));
		System.out.println("The result is " + r);
	}
}