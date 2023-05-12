package PROJECT;
import java.util.*;
public class Test {
    //Creatint Employee Datebase for Getting Data
    public static Employee[] employeeDatebase(int n , Scanner sc) {
        Employee []employeeDatebase = new Employee[n];
        for (int i=0 ; i<n ; i++) {
            System.out.println("--------> EMPLOYEE " + (i+1) + " : ");
            //Name
            sc.nextLine();
            System.out.print("Enter Your Full Name : ");
            String name = sc.nextLine();

            //Employee Id
            System.out.print("Enter Employee Id : ");
            int empId = sc.nextInt();

            //Salary
            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            //Hire Date
            System.out.print("Enter Hire Date : ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            Date hireDate = new Date(day, month, year);

            //Job Position
            System.out.print("Enter Job Position : ");
            String jobPosition = sc.next();

            //Contact Number
            System.out.print("Enter Contact Number : ");
            String contactNumber = sc.next();

            //Address
            System.out.print("Enter Address (street , city , state , pincode) : ");
            String street = sc.next();
            String city = sc.next();
            String state = sc.next();
            int pincode = sc.nextInt();
            Address address = new Address(street, city, state, pincode);

            employeeDatebase[i] = new Employee(name, empId, salary, hireDate, jobPosition, contactNumber, address);
        }
        
        return employeeDatebase;
    }
    // Creating Method to Arranging Employee Salary
    public static void arrangeEmployeeBySalary(Employee e[]) {
        for (int i=0 ; i<e.length ; i++) {
            for (int j=0 ; j<e.length ; j++) {
                if (e[j].getSalary() < e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }

            }
        }
    }

    // Creating Method To Display Employee Detail By Job Postion 
    public static void getEmployeesByJobPosition(Employee e[], String jp) {
        for (int i=0 ; i<e.length ; i++) {
            if (e[i].getJobPosition().equals(jp)) {
                System.out.println("--------> " + " Employee Detail <-------- : ");
                System.out.println(e[i].getEmployee());
            }
        }
    }

    // Creating Method to Display HireDate 
    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2) {
        for (int i=0 ; i<e.length ; i++) {
            if(e[i].getHireDate().compareTo(d1.getDate()) >=0 && e[i].getHireDate().compareTo(d2.getDate()) <= 0) {
                System.out.println("--------> " + " Employee Detail <-------- : ");
                System.out.println(e[i].getEmployee());
            }
        }
    }

    // Creating Method to count the Number of foreign Employee
    public static int foreignEmployeeCount(Employee e[]) {
        int c = 0;
        for (int i=0 ; i<e.length ; i++) {
            if(!(e[i].getContactNumber().startsWith("+91"))) {
                c++;
            }
        }
        return c;
    }

    // Creating Method To Display Employee Detail whose Salary is in Between i and j
    public static void getEmployeesBySalary(Employee e[], double s1, double s2) {
        for (int i=0 ; i<e.length ; i++) {
            if (e[i].getSalary() >= s1 && e[i].getSalary() <= s2) {
                System.out.println("--------> " + " Employee Detail <-------- : ");
                System.out.println(e[i].getEmployee());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Employees : ");
        int n = sc.nextInt();
        System.out.println();
        // Creating Employee Datebase
        System.out.println("----> Employee Database Creation Started : ");
        System.out.println("|");
        System.out.println("v");
        Employee []e = employeeDatebase(n , sc);

        // Arranging Employee Salary
        System.out.println();
        System.out.println("|");
        System.out.println("v");
        System.out.println("----> Sorting the Employee Database According to Salary in Decresing Order : ");
        arrangeEmployeeBySalary(e);
        System.out.println("----> Sorting is Done <----");
        
        //Displaying Job positoin
        System.out.println();
        System.out.println("----> For Displaying the Detail of Employee (of the Entered Job Position ) : ");
        System.out.println("|");
        System.out.println("v");
        System.out.print("Enter Job Position : ");
        String jp = sc.next();
        getEmployeesByJobPosition(e, jp);

        //Displaying Hire Date
        System.out.println();
        System.out.println("----> For Displaying the Detail of the Employee Between the Following Dates : ");
        System.out.println("|");
        System.out.println("v");
        System.out.print("Enter starting Hire Date : ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        Date date1 = new Date(d1, m1, y1);
        System.out.print("Enter Ending Hire Date : ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        Date date2 = new Date(d2, m2, y2);
        System.out.println("|");
        System.out.println("v");
        getEmployeesByHireDate(e, date1, date2);

        //Counting the Number of Foreign Employee
        System.out.println();
        System.out.println("----> Display the Foreign Employees : ");
        System.out.println("The Number of Foreign Employees are : " + foreignEmployeeCount(e));


        // Display Employee Detail whose Salary is in Between s1 and s2
        System.out.println();
        System.out.println("----> Displaying the Employee Detail between the range of the following Salary : ");
        System.out.println("|");
        System.out.println("v");
        System.out.print("Enter the salary value of S1 : ");
        double s1 = sc.nextDouble();
        System.out.print("Enter the salary value of s2 : ");
        double s2 = sc.nextDouble();
        getEmployeesBySalary(e, s1, s2);
    }
}