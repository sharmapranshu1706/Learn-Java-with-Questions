public class loopProblem {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for(int j=1; j<=5;j++){
            System.out.print(j+ " ");
        }
        System.out.println("");
        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        int k=1;
        while(k<=5){
            System.out.print(k+ " ");
            k++;
        }
        System.out.println("");
        // TODO: Print numbers 1 to 5 using do-while loop
        int l=1;
        System.out.print("Do-While Loop: ");
        do{
            System.out.print(l+ " ");
            l++;
        }while(l<=5);
    }
}