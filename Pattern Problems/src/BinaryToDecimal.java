public class BinaryToDecimal {
    public static int bintoDec(int binNum) {
        int decNum = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, pow);
            binNum /= 10;
            pow++;
        }
        return decNum;
    }
    public static void main(String[] args){
    System.out.println(bintoDec(1011));
    }
}
