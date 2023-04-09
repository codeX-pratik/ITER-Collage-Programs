/*
Write a Java program that can take a positive integer greater than 2 as input and
 write out the number of times one must repeatedly divide this number by 2 before
getting a value less than 2.
 */

package DSA_ASSIGNMENT_1;
public class p1 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int c = 0;
        while (n >= 2) {
            if (n >= 2) {
                c++;
            }
            n = n / 2;
        }
        System.out.println(c);
    }
}
/*
output : 

6
 */