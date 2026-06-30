class GrandParents{

    //Autoboxing: Primitive - object
    Integer a=10; // Compiler Does Integer.valueof(10);

    //Unboxing : Object - Primitive
    int b=a; // Compiler Does a.intValue();
    void check(){
        System.out.println("GrandParents");
    }
}
class Parents extends GrandParents{
    //Autoboxing: Primitive - object
    Integer c=20; // Compiler Does Integer.valueof(20);

    //Unboxing : Object - Primitive
    int d=c; // Compiler Does c.intValue();
    String s="14";
    int b=Integer.parseInt(s); // String to int
    void pass(){
        check();
        System.out.println(b);
    }
}
class Child extends Parents{
    //Autoboxing: Primitive - object
    Double e=30.5; // Compiler Does Double.valueOf(30.5);

    //Unboxing : Object - Primitive
    double f=e; // Compiler Does e.doubleValue();
    public static void main(String[] args){
        GrandParents g=new GrandParents();
        g.check();
        Parents p = new Parents();
        p.pass();


    }

}
