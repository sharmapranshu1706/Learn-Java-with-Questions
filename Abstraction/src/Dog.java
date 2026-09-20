abstract class Animal {
    abstract void bark();
    abstract void foodEatType();
}
class Tiger extends Animal{
    @Override
    void bark() {
        System.out.println("Tiger Bark");
    }
    @Override
    void foodEatType(){
        System.out.println("Tiger is a Carnivores");
    }
}
class Dog extends Animal{

    @Override
    void bark() {
        System.out.println("Bark");
    }

    @Override
    void foodEatType() {
        System.out.println("Dog is a Omnivores");
    }
    public static void main(String[] args){
        Animal a = new Dog();
        a.foodEatType();
        a.bark();
        Animal b = new Tiger();
            b.bark();
            b.foodEatType();
        }
    }

