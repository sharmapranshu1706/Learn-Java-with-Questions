class Child {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Child {
    int rollno;
    String course;

    @Override
    void display() {
        super.display();
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "John";
        student.age = 20;
        student.rollno = 101;
        student.course = "Computer Science";

        student.display();
    }
}