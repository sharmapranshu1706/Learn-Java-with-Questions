class HanumanSena {
    Integer sena = 100; // Boxing
    int newSena = sena; // Unboxing
    void callSena(){
        System.out.println("Attention to Sena");
    }
}
class Hanuman extends HanumanSena{
    Integer moreSena = newSena;
    String totalhanumanSena = "100";
    int num = Integer.parseInt(totalhanumanSena);
    void jaiShreeRam(){
        System.out.println(num);
    }
}
class ShreeRam extends Hanuman{
    Double averageHeightFt = 8.5;
    double b = averageHeightFt;
    public static void main(String[] args){
        HanumanSena h = new HanumanSena();
        h.callSena();
        Hanuman b = new Hanuman();
        b.jaiShreeRam();
    }
}
