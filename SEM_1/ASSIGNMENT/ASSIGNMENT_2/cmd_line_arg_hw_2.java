public class cmd_line_arg_hw_2 {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);

		double A = 2 * Math.PI * r * (r + h);
		System.out.println("The surface Area of the cylinder is " + A);
	}
}