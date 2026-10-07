interface Machine {
    String start();
}
abstract class Appliance implements Machine {
    String name;
    Appliance(String name){
        this.name=name;
    }
}
class Fan extends Appliance{
    Fan(String name){
        super(name);
    }
    @Override
    public String start(){
        return "Fan is Running state";
    }
}
class WashingMachine extends Appliance{
    WashingMachine(String name){
        super(name);
    }
    @Override
    public String start(){
        return "Machine is Running state";
    }
}
class Main{
    public static void main(String[] args){
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washer");
        System.out.println(fan.start());
        System.out.println(washer.start());

    }
}
