
abstract class Vehicle {
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped by brake");
    }
}
interface  Electric{
    void charge();
}
interface GPS{
    void navigate();
}
class Car extends Vehicle implements Electric, GPS{
    void start(){
        System.out.println("Car Started");
    }
    public void charge(){
        System.out.println("Battery Charging");
    }
    public void navigate(){
        System.out.println("GPS Navigation Started");
    }
    public static void main(String[] args){
        Car i = new Car();
        i.start();
        i.charge();
        i.navigate();
        i.stop();
    }
}

