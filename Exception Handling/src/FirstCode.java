public class FirstCode{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
            String s = null;
            s.length();
        }
        catch (NullPointerException e){
            System.out.println("The Value is Null");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println();
        System.out.println("Bye");
    }
}
