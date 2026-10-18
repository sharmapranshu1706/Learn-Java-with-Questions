public class Second {
    public static void main(String[] args){
        String s = null;
        try {
            s.length();
        }
        catch (NullPointerException e){
//            System.out.println("Null Value");
        }
        finally {
            System.out.println("final Call");
        }
    }
}
