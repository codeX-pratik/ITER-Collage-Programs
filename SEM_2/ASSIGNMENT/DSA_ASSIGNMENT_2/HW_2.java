import java.util.*;
class Book {
    String BName;
    String BEdition;
    double BPrice;
    Book(String BN , String BE , double BP) {
        this.BName = BN;
        this.BEdition = BE;
        this.BPrice = BP;
    }
    void Display() {
        System.out.println("Book Name : " + BName);
        System.out.println("Book Edition : " + BEdition);
        System.out.println("Book Price : " + BPrice);
    }
}

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of Book : ");
        int n = sc.nextInt();
        double max = Integer.MIN_VALUE;
        Book []b = new Book[n];
        for (int i=0 ;i<b.length ; i++) {
            System.out.println("----> " + (i+1) + " BOOK <----");
            System.out.print("Enter Book Name : ");
            String name = sc.next();
            System.out.print("Enter Book Edition : ");
            String edition = sc.next();
            System.out.print("Enter Book Price : ");
            double price = sc.nextDouble();
            b[i] = new Book(name, edition, price);
            max = Math.max(b[i].BPrice, max);
        }
        System.out.println("------> Detail of the Books ! <------");
        for (int i=0 ; i<b.length ; i++) {
            if (b[i].BPrice == max) {
                b[i].Display();
                break;
            }
        }
        
        sc.close();
    }
}
