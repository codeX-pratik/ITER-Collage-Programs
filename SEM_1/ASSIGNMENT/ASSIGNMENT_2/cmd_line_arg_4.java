public class cmd_line_arg_4 {
	public static void main(String [] args) {
		double t = Double.parseDouble(args[0]);
		double r = Math.cos(5 * t) + Math.sin(7 * t);
		System.out.println("The value is " + r);
	}
}