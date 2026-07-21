class Cat {
    void sound(){
        System.out.println("Meow");
    }
}
class Tiger extends Cat{
@Override
    void sound(){
        System.out.println("Roar");
    }
    public static void main(String[] a){
        Cat c = new Tiger();
        c.sound();
    }

}
