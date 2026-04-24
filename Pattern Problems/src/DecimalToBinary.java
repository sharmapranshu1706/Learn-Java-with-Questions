public class DecimalToBinary {
    public static void dectoBin(int decNum){
        int binNum = 0;
        int pow = 0;

        while (decNum>0) {
            int  lastDigit = decNum%2;
            binNum+=lastDigit*(int)Math.pow(10,pow);
            pow++;
            decNum/=2;

        }
        System.out.println("Binary No. of " + decNum + "is = " + binNum);
    }
    public static void main(String[]args){
        dectoBin(15);
    }
}
