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

/*
----> Data for Testing purpose
employeeDatebase[0] = new Employee("java user_1", 2001, 1000, new Date(10, 5 ,2023), "manager", "+91123456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[1] = new Employee("java user_2", 2002, 2000, new Date(11, 5, 2023), "Software_Developer", "+91987456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[2] = new Employee("java user_3", 2003, 3000, new Date(13, 5, 2023), "Graphic_Designer", "+85258963", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[3] = new Employee("java user_4", 2004, 804000, new Date(14, 5, 2023), "manager", "+652789654", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[4] = new Employee("java user_5", 2005, 5000, new Date(15, 5, 2023), "Software_Developer", "+91789654", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[5] = new Employee("java user_6", 2006, 6000, new Date(16, 5, 2023), "manager", "+85941256", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[6] = new Employee("java user_7", 2007, 7000, new Date(17, 5, 2023), "Data_Scientist", "+78951236", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[7] = new Employee("java user_8", 2008, 8000, new Date(18, 5, 2023), "Software_Developer", "+32456987", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[8] = new Employee("java user_9", 2009, 9000, new Date(19, 5, 2023), "manager", "+91852456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[9] = new Employee("java user_10", 2010, 10000, new Date(20, 5, 2023), "Cyber_Security", "+91456852", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
           
----->For Salary Testing

        for (int i=0 ; i<n ; i++) {
            System.out.println("------------> Employee " + (i+1) + " : ");
            System.out.println(e[i].getEmployee());
        }

        System.out.println("---->intput Done <----");

        arrangeEmployeeBySalary(e);


        for (int i=0 ; i<n ; i++) {
            System.out.println("------------------------------------------------------> Employee " + (i+1) + " : ");
            System.out.println(e[i].getEmployee());
        }

        System.out.println("----> Sorting Done <----");




        



        OUTPUT

Enter the Number of Employees : 10

----> Employee Database Creation Started :
|
v
employeeDatebase[0] = new Employee("java user_1", 2001, 1000, new Date(10, 5 ,2023), "manager", "+91123456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[1] = new Employee("java user_2", 2002, 2000, new Date(11, 5, 2023), "Software_Developer", "+91987456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[2] = new Employee("java user_3", 2003, 3000, new Date(13, 5, 2023), "Graphic_Designer", "+85258963", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[3] = new Employee("java user_4", 2004, 804000, new Date(14, 5, 2023), "manager", "+652789654", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[4] = new Employee("java user_5", 2005, 5000, new Date(15, 5, 2023), "Software_Developer", "+91789654", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[5] = new Employee("java user_6", 2006, 6000, new Date(16, 5, 2023), "manager", "+85941256", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[6] = new Employee("java user_7", 2007, 7000, new Date(17, 5, 2023), "Data_Scientist", "+78951236", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[7] = new Employee("java user_8", 2008, 8000, new Date(18, 5, 2023), "Software_Developer", "+32456987", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[8] = new Employee("java user_9", 2009, 9000, new Date(19, 5, 2023), "manager", "+91852456", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));
employeeDatebase[9] = new Employee("java user_10", 2010, 10000, new Date(20, 5, 2023), "Cyber_Security", "+91456852", new Address("jagamara", "Bhubaneswar", "Odisha", 751089));

|
v
----> Sorting the Employee Database According to Salary in Decreasing Order :
----> Sorting is Done <----

----> For Displaying the Detail of Employee (of the Entered Job Position ) :
|
v
Enter Job Position : manager
-------->  Employee Detail <-------- :
Name : java user_4
Employee Id : 2004
Salary : 804000.0
Hire Date : 14-5-2023
Job Position : manager
Contact Number : +652789654
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_9
Employee Id : 2009
Salary : 9000.0
Hire Date : 19-5-2023
Job Position : manager
Contact Number : +91852456
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_6
Employee Id : 2006
Salary : 6000.0
Hire Date : 16-5-2023
Job Position : manager
Contact Number : +85941256
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_1
Employee Id : 2001
Salary : 1000.0
Hire Date : 10-5-2023
Job Position : manager
Contact Number : +91123456
Address : jagamara , Bhubaneswar , Odisha , 751089


----> For Displaying the Detail of the Employee Between the Following Dates :
|
v
Enter starting Hire Date : 13 5 2023
Enter Ending Hire Date : 18 5 2023
|
v
-------->  Employee Detail <-------- :
Name : java user_4
Employee Id : 2004
Salary : 804000.0
Hire Date : 14-5-2023
Job Position : manager
Contact Number : +652789654
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_8
Employee Id : 2008
Salary : 8000.0
Hire Date : 18-5-2023
Job Position : Software_Developer
Contact Number : +32456987
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_7
Employee Id : 2007
Salary : 7000.0
Hire Date : 17-5-2023
Job Position : Data_Scientist
Contact Number : +78951236
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_6
Employee Id : 2006
Salary : 6000.0
Hire Date : 16-5-2023
Job Position : manager
Contact Number : +85941256
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- : 
Name : java user_5
Employee Id : 2005
Salary : 5000.0
Hire Date : 15-5-2023
Job Position : Software_Developer
Contact Number : +91789654
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- : 
Name : java user_3
Employee Id : 2003
Salary : 3000.0
Hire Date : 13-5-2023
Job Position : Graphic_Designer
Contact Number : +85258963
Address : jagamara , Bhubaneswar , Odisha , 751089

----> Display the Foreign Employees :
The Number of Foreign Employees are : 5

----> Displaying the Employee Detail between the range of the following Salary :
|
v
Enter the salary value of S1 : 3000
Enter the salary value of s2 : 7000
-------->  Employee Detail <-------- :
Name : java user_7
Employee Id : 2007
Salary : 7000.0
Hire Date : 17-5-2023
Job Position : Data_Scientist
Contact Number : +78951236
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_6
Employee Id : 2006
Salary : 6000.0
Hire Date : 16-5-2023
Job Position : manager
Contact Number : +85941256
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- :
Name : java user_5
Employee Id : 2005
Salary : 5000.0
Hire Date : 15-5-2023
Job Position : Software_Developer
Contact Number : +91789654
Address : jagamara , Bhubaneswar , Odisha , 751089
-------->  Employee Detail <-------- : 
Name : java user_3
Employee Id : 2003
Salary : 3000.0
Hire Date : 13-5-2023
Job Position : Graphic_Designer
Contact Number : +85258963
Address : jagamara , Bhubaneswar , Odisha , 751089


 */