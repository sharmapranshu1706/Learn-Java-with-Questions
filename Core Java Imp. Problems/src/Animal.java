public class Animal {
//    String name;
//    Animal(String name){
//        this.name=name;
//        System.out.println("Animal name is: "+name);
//    }
    void sound(){
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
//        Dog(String name){
//        super(name);// Parent Constructor Call
//        System.out.println("Dog name is: "+name); // Child Constructor Call
//    }
    @Override
    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
    }
}
