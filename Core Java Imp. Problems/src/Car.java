class Vehicle {
    String carName;
    String carColor;
    protected int carChasisNo;

    //Constructr✅
    Vehicle(String carColor,String carName, int carChasisNo){
        this.carName=carName;
        this.carColor=carColor;
        this.carChasisNo=carChasisNo;
    }
    //Method✅
    void carInfo(){
        System.out.println("Car Name: "+carName);
        System.out.println("Car Color: "+carColor);
        System.out.println("Car Chasis No: "+carChasisNo);
    }
}
class Car extends Vehicle{

    //Constructor✅
    Car(String carColor,String carName, int carChasisNo){
        super(carColor, carName, carChasisNo);
    }
    // Method Overriding
    @Override
    void carInfo() {
        super.carInfo();

    }
    public static void main(String[] args){
        Vehicle c = new Car("White", "XUV 7OO", 5678);
        c.carInfo();
    }
}
