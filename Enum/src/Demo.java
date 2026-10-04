enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
public class Demo{
    public static void main(String[] args){
        Days d= Days.Sunday;

        // if-else
//        if(d == Days.Friday){
//            System.out.println("Day is Friday");
//        }
//        else{
//            System.out.println("Today is not "+d);
//        }
        // Switch Case
//        switch (d){
//            case Monday:
//                System.out.println("Week First Day: "+d);
//                break;
//
//            case Tuesday:
//                System.out.println("Week Second Day");
//                break;
//
//            case Sunday:
//                System.out.println("It's Weekend!");
//        }
        // Modern Switch Case
        switch (d){
            case Monday -> System.out.println("It's a Monday");
            case Sunday -> System.out.println("It's Weekend");
        }

    }
}