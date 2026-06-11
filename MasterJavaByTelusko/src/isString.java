public class isString {
    public static void main(String[] args){
        String name=new String("Pranshu");
        //Below are the References
        //Mutable String will change // Mutable String will be changed by Garbage Collector
        //Immutable String can't change
        String s1=new String();
        String s2=new String();
        name=name+" Sharma";

        System.out.println(name);
    }
}
