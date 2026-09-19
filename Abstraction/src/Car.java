abstract class Vehicle {
    abstract public void vehicleFeatures();
}
class Car extends Vehicle{
    @Override
    public void vehicleFeatures(){
        System.out.println("Adas System");
        System.out.println("Automatic");
    }
    public static void main(String[] args){
        Vehicle car = new Car();
        car.vehicleFeatures();
    }
}

