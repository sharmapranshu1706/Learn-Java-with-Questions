class anotherObj {
    String s1="Hello";
    String s2="World";
    //Take a Reference of s1.
    String s3=s1;
    //New Objects are created in heap memory
    String s4=new String("Hello");
    // Parent Class Method
    void display(){
        System.out.println(s1.equals(s1));
        System.out.println(s2.equals(s2));
        System.out.println(s3.equals(s3));
        System.out.println(s4.equals(s4));
    }   
}
public class otherObj{
    public static void main(String[] args){
        anotherObj obj=new anotherObj();
        obj.display();
    }
}
