enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
public class Demo{
    public static void main(String[] args){
        Days d= Days.Tuesday;
        if(d == Days.Friday){
            System.out.println("Day is Friday");
        }
        else{
            System.out.println("Today is not "+d);
        }
    }
}