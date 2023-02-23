

import java.util.Scanner;
public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes :");
        int min = sc.nextInt();

        int year = min / 525600;
        //int day = min / 1400;
        int remaining_day = year % 525600;

        System.out.println(min + " minutes is approximately " + year + " years and " + remaining_day + " days.");
        sc.close();
        
    }
}
