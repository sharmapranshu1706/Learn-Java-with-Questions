public class linearSearch {
    public static String linearSearch(String[] menuList, String findKey) {
        for(int i = 0; i < menuList.length; i++){
            if(menuList[i].equals(findKey)){
                System.out.println(findKey + " is found at index: " + i);

            }
        }

        return findKey;
    }
    public static void main(String[] args) {
        String[] menuList = {"Burger", "Fries", "Coke", "Pizza", "Salad"};
        String findKey = "puri";

        String Index=linearSearch(menuList, findKey);
        if(Index.equals(findKey)) {
            System.out.println("Item found ");
        } else {
            System.out.println("Item not found");
        }

    }
}
