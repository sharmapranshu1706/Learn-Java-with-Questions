

// In this program we demonstrate constructor chaining in inheritance
// And method overriding
//When we Call a constructor of a subclass, it automatically calls the constructor of its superclass
//

class A{
    A(){
        super();
        System.out.println("A");
    }
    A(int n){
       
        System.out.println("A int");
    }
}
class B extends A{
    B(){
        
        System.out.println("B");
    }
    B(int n){
       super();
        System.out.println("B int");
    }
}
public class Demo {
    public static void main(String[] args){
        B b1 = new B();
    }

}
