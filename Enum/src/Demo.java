enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
public class Demo{
    public static void main(String[] args){
        Days d= Days.Sunday;
//        if(d == Days.Friday){
//            System.out.println("Day is Friday");
//        }
//        else{
//            System.out.println("Today is not "+d);
//        }
        switch (d){
            case Monday:
                System.out.println("Week First Day: "+d);
                break;

            case Tuesday:
                System.out.println("Week Second Day");
                break;

            case Sunday:
                System.out.println("It's Weekend!");
        }
    }
}