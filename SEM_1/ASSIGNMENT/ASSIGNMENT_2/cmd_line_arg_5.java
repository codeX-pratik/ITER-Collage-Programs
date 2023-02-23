public class cmd_line_arg_5 {
	public static void main(String[]args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		int max1 = Math.max(num1 , num2);
		int max2 = Math.max(max1 , num3);

		int min1 = Math.min(num1 , num2);
		int min2 = Math.min(min1 , num3);

		int midnum = num1 + num2 + num3 - max2 - min2;

		System.out.println(min2 + " " + midnum + " " + max2);
	}
}