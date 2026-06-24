class Student{
    int id;

    @Override
    public boolean equals(Object obj){
        Student s =(Student)obj;
        return this.id==s.id;
    }
    public Student(int id){
        this.id = id;
    }
    public static void main(String[] args){
        Student s1=new Student(1);
        Student s2=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.getClass());


    }
}