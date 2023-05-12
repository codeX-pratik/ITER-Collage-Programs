package PROJECT;

public class Employee {
    private String name;
    private int empId;
    private double salary;
    private Date hireDate;
    private String jobPosition;
    private String contactNumber;
    private Address address;

    Employee(String name , int empId , double salary , Date hireDate , String jobPosition , String contactNumber , Address address) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getEmpid() {
        return empId;
    }
    public double getSalary() {
        return salary;
    }
    public String getHireDate() {
        return hireDate.getDate();
    }
    public String getJobPosition() {
        return jobPosition;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getAddress() {
        return address.getAddress();
    }

    public String getEmployee() {
        return (
            "Name : " + name + 
            "\nEmployee Id : " + empId + 
            "\nSalary : " + salary + 
            "\nHire Date : " + hireDate.getDate() + 
            "\nJob Position : " + jobPosition + 
            "\nContact Number : " + contactNumber +
            "\nAddress : " + address.getAddress()
        );
    }
}

