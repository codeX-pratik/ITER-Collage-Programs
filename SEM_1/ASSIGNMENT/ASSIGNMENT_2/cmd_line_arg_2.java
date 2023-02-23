public class cmd_line_arg_2 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		double pow = Math.pow(num1 , num2);
		System.out.println("The result is " + pow);
	}
}