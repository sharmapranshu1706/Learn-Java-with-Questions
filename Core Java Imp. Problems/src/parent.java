class child{
    int age;
    String name;
    child(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class parent extends child{
    parent(int age, String name) {
        super(age, name);
    }

    void run(){
        super.age = 20;
        super.name="Ayush";
        System.out.println("Age: "+super.age);
        System.out.println("Name: "+super.name);
    }
    public static void main(String[] a){
        parent p = new parent(22, "Henry");
        p.run();
        child c = new child(30, "Doe");
        System.out.println("Child Age: "+c.age);
        System.out.println("Child Name: "+c.name);

    }
}
