@java.lang.FunctionalInterface
interface A {
    int show(int i,int j);
}
public class FunctionalInterface{
    public static void main(String[] args){
        //Lambda expression only works with FunctionalInterface
        A obj = Integer::sum;
        int result = obj.show(5,6);
        System.out.print(result);
    }
}
