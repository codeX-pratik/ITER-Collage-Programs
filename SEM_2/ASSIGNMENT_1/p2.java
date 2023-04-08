/*
The body mass index (BMI) is commonly used by health and nutrition professionals 
to estimate human body fat in populations. It is computed by taking the individual's
weight (mass) in kilograms and dividing it by the square of their height in 
meters. i.e.
Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
Write a java program by using conditional statement to show the category for a 
given BMI.
 */

package ASSIGNMENT_1;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter person Weight in kg : ");
        double weight = sc.nextDouble();
        System.out.print("Enter height of person in meter : ");
        double height = sc.nextDouble();
        double BMI = weight/(height * height);
        String result = "";
        if (BMI < 18.5) {
            result = "Under Weight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "Normal Weight";
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            result = "Over Weight";
        } else if (BMI > 30.0){
            result = "Obese";
        }
        System.out.println("The person is " + result);
        sc.close();
    }
}
/*
output :

Enter person Weight in kg : 96
Enter height of person in meter : 1.4
The person is Obese
 */