class Employee{
    private final String name;
    private final int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    String getDetails(){
        return "Name: "+name+", Salary: "+salary;
    }
}
class Manager extends Employee{
    private final String department;
    Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    @Override
    String getDetails(){
        return super.getDetails()+", Department: "+department;
    }
}

public class Management {
    public static void main(String[] args){
        Employee e= new Employee("John Doe", 50000);
        System.out.println(e.getDetails());
        Manager m =new Manager("Jane Smith", 80000, "Sales");
        System.out.println(m.getDetails());
    }
}
