public class cmd_line_arg_hw_3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //9999
		
		int R1 = n % 10; 
		int Q1 = n / 10;

		//int R2 = Q1 % 10;
		int Q2 = Q1 / 10;

		//int R3 = Q2 % 10;
		int Q3 = Q2 / 10;

		int R4 = Q3 % 10;
		//int Q4 = Q3 / 10;

		int sum = R1 + R4;
		System.out.println("The sum of first and last Number is " + sum);
	}
}