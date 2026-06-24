class Student1 {
    //Instance Variable
    final int age;
    final String name;
    final int rollNo;
    //Constructor
    public Student1(){
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
        Student1 obj = new Student1();
        System.out.println("Name: "+ obj.getAge() + "  Age is: "+obj.getName() + " Roll No is: "+obj.getRollNo());
    }
}
