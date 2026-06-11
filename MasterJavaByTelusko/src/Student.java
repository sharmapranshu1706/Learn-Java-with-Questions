public class Student {
    //Instance Variable
    final int age;
    final String name;
    final int rollNo;
    //Constructor
    public Student(){
        age=22;
        name="A Sharma";
        rollNo=22;
    }
    public int getAge(){
           return age;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println("Name: "+ obj.getAge() + "  Age is: "+obj.getName() + " Roll No is: "+obj.getRollNo());
    }
}
