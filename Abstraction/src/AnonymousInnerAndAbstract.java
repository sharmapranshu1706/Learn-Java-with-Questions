abstract class Check  {
    abstract void show();
}
public class AnonymousInnerAndAbstract {
    public static void main(String[] args){
        Check ch = new Check() {
            @Override
            void show() {
                System.out.println("Mixed UP!");
            }
        };
        ch.show();
    }
}
