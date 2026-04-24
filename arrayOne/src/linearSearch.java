import java.util.Scanner;
public class linearSearch {
    public static String menuList(String[] foods, String findKey) {
        for(int i = 0; i < foods.length; i++){
            if(foods[i].equals(findKey)){
                return findKey + " is found at index " + i + " in the menu list.";
            }
        }
        return findKey + " is not Available in the menu list.";
    }
    public static void main(String[] args) {
        String[] foods = {"Burger", "Fries", "Coke", "Pizza", "Salad"};
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter item to Search : ");
        String findKey = Sc.nextLine();
        String Result=menuList(foods, findKey);
        System.out.println(Result);
        Sc.close();
    }
}
