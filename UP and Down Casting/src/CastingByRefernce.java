class Casting {
    String check;
    void setCheck(){
        check = "Casting";
        System.out.println("Parent Class");
    }
}
class CastingByRefernce extends Casting{
    void display(){
        System.out.println("Child Class");
    }
    public static void main(String[] args){
        Casting c1= (CastingByRefernce)new CastingByRefernce();
        c1.setCheck();

        CastingByRefernce c2= (CastingByRefernce)c1;
        c2.display();
    }
}
