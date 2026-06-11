class Teacher {
    int age;
    //When U using a static keyword in variable and class that working
    // as a common variable and common class for all the objects of that class
    static String collegeName;
    int sNo;
//Constructor
    Teacher() {
        collegeName = "AYZ";
    }
    //Method
    public void display() {
        System.out.println("Age: " + age);
        System.out.println("College Name: " + collegeName);
        System.out.println("S No: " + sNo);
    }
}
//Main Class
    public class Main {
        public static void main(String[] args) {
            //Object Initialisation
            Teacher obj = new Teacher();
            obj.age = 24;
            obj.sNo = 1;
            //Second Object
            Teacher obj1 = new Teacher();
            obj1.sNo = 2;
            obj1.age = 23;
            //method call
            obj.display();
            obj1.display();
        }
    }

