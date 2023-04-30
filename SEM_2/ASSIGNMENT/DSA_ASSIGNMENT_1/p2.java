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