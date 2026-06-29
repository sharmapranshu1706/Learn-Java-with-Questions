package com.office;
// Manager class inherits from Employee class
// Same Package, so it can access protected and default members of Employee class

class Manager extends Employee {
    String role="Manager";
    int hikesalary=100000;
    public void roleUpgrade() {
        getSalary();
        System.out.println("  Role Upgraded to Manager");
    }

}
