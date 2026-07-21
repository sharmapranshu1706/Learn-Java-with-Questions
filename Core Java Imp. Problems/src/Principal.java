class Teacher {
    String s1;
    String s2;
    String s3;
    String s4;

    Teacher(String s1, String s2, String s3, String s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = new String(s1);
        this.s4 = s4;
    }

    void teacherInfo() {
        System.out.println("\n---==vs .equals() Demo --- ");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}
public class Principal extends  Teacher {
    Principal(String s1, String s2, String s3, String s4) {
        super(s1, s2, s3, s4);
    }
    @Override
    void teacherInfo(){
        super.teacherInfo();
    }
    public static void main(String[] a){
        Teacher t = new Principal("Teacher1", "Teacher2", "Teacher3", "Teacher1");
        t.teacherInfo();
    }
}

