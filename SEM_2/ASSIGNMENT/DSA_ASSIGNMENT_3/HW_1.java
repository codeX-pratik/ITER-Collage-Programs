import java.util.*;

class InvalidBalanceException extends Exception {
    public String getMessage() {
        return "Balance cannot be less than 0";
    }
}

class Bank {
    int accountNumber;
    String name;
    double balance;
    
    public void input_Details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        accountNumber = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Balance : ");
        balance = sc.nextDouble();
    }
    public void display_Details() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }

    public void withdrawMoney() throws InvalidBalanceException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw : ");
        int Withdraw = sc.nextInt();
        balance = balance - Withdraw;
        if (balance < 0) {
            throw new InvalidBalanceException();
        }
        System.out.println("Withdraw Successful");
        System.out.println("Balance : " + balance);
    }
}
public class HW_1 {
    public static void main(String[] args) {
        try {
            Bank b = new Bank();
            b.input_Details();
            b.display_Details();
            b.withdrawMoney();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*

Enter Account Number : 12345
Enter Name : pratik
Enter Balance : 700
Account Number : 12345
Name : pratik
Balance : 700.0
Enter Amount to Withdraw : 300
Withdraw Successful
Balance : 400.0


Enter Account Number : 12345
Enter Name : pratik
Enter Balance : 700
Account Number : 12345
Name : pratik
Balance : 700.0
Enter Amount to Withdraw : 900
InvalidBalanceException: Balance cannot be less than 0

 */