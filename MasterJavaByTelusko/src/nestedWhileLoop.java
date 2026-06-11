import java.sql.SQLOutput;

public class nestedWhileLoop {
    public static void main(String[] args){
        int i=1;
        while(i<=5){
            System.out.println("O");
            int j=1;
            // when using an inner loop we have to make sure that the variable used in the inner loop is different from
            // the variable used in the outer loop otherwise we will get an infinite loop because the variable used in
            // the inner loop will be updated and, it will affect the variable used in the outer loop and, it will never
            // reach the condition to exit the loop
            while(i<=4){
                System.out.println("I");
                i++;
            }
            i++;
        }
        System.out.println("Loop Out");
    }
}
