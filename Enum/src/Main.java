enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");
    private final String code;
    Size(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
public class Main{
    public static void main(String[] args){
        Size s = Size.MEDIUM;
        System.out.println(s);
        System.out.println(s.getCode());
    }
}
