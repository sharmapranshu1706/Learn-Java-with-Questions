class PranshuException extends Exception {
    public PranshuException(String string){
        super(string);
    }
}
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
        new A();
        try {
            throw new PranshuException("Error");
        }
        catch (PranshuException e){
            e.printStackTrace();
        }
    }
}
