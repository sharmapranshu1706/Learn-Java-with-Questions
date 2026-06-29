package com.office;

public class Main {
    public static void main(String[] args){
        Manager emp = new Manager();
        System.out.println("Employee Name:"+ emp.name);
        System.out.println("New Role:"+ emp.role);
        System.out.print("Last Salary "+ emp.salary+" hike To | ");
        System.out.print("New Salary:"+ emp.hikesalary);
        emp.roleUpgrade();
        }

}
