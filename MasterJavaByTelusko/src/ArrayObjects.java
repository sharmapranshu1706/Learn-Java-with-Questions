class Students{
        int rollno;
        String name;
}
public class ArrayObjects {
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.rollno = 1;
        st1.name = "John";

        Students st2 = new Students();
        st2.rollno = 2;
        st2.name = "Jane";

        Students st3 = new Students();
        st3.rollno = 3;
        st3.name = "Doe";

        Students st4 = new Students();
        st4.rollno = 4;
        st4.name = "Kaalu";

        Students[] students = new Students[4];
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        for (Students data :students) {
            System.out.println(data.rollno + " " + data.name);
        }
    }
}
