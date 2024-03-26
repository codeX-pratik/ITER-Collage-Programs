class Employee {
    constructor (firstName, lastName, noOfYearWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noOfYearWorked = noOfYearWorked;
    }

    getDetail() {
        return `${this.firstName} ${this.lastName} has worked for ${this.noOfYearWorked} years.`;
    }
}

let emp1 = new Employee("Tom", "cruise", 5);
let emp2 = new Employee("Jane", "Smith", 3);

let employees = [emp1, emp2];
for (let i=0 ; i<employees.length ; i++) {
    console.log(employees[i].getDetail());
}