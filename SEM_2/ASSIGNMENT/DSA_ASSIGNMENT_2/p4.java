import java.util.*;
class Product {
    int pid;
    int price;
    static double tot_price = 0;
    public Product(int pid , int price) {
        this.pid = pid;
        this.price = price;
        Product.tot_price += price;
    }
    void display() {
        System.out.println("Product ID : " + pid);
        System.out.println("Product Price : " + price);
    }
}
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product []prodt = new Product[5];
        for (int i=0 ; i<5 ; i++) {
            System.out.println("------> "  + (i+1) + " Item");
            System.out.print("Enter the Product ID : ");
            int pid = sc.nextInt();
            System.out.print("Enter the Product Price : ");
            int price = sc.nextInt();

            prodt[i] = new Product(pid, price);
        }
        System.out.println("------> PRODUCT DETAIL <------");
        for (int i=0 ;i<5 ; i++) {
            prodt[i].display();
        }
        System.out.println("----> Total Price is " + Product.tot_price);
        sc.close();
    }
}