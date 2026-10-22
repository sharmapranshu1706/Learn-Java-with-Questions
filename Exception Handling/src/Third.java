//class PranshuException extends Exception {
//    public PranshuException(String string){
//        super(string);
//    }
//}
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("B");
    }
}
public class Third {
    static {
        System.out.println("Class Loader");
    }
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
