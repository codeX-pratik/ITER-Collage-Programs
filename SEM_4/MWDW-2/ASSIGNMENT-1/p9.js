class University {
    constructor(name, department) {
        this.name = name;
        this.department = [];
    }

    addDepartment(department) {
        if (!this.department.includes(department)) {
            this.department.push(department);
            console.log(`Department ${department} added successfully`);
        } else {
            console.log("Department already exists");
        }
    }

    removeDepartment(department) {
        let idx = this.department.indexOf(department);
        if  (idx !== -1) {
            this.department.splice(idx, 1);
            console.log(`Department ${department} removed successfully.`);
        } else {
            console.log("Department does not exist");
        }
    }

    displayDepartment() {
        console.log(`Department in ${this.name} are : `);
        // this.department.forEach(x => console.log(x));
        console.log(this.department);
    }
}

const u1 = new University("Physics");
u1.addDepartment("computer science");
u1.addDepartment("UHV");
u1.addDepartment("Mathematics");
u1.addDepartment("COA");
u1.displayDepartment();

u1.removeDepartment("UHV");
u1.displayDepartment();