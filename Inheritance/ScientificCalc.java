class ScientificCalc extends Calc {
    public int power(int a, int b){
        return (int) Math.pow(a, b);
    }
    public int squareRoot(int a){
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number");
        }
        return (int) Math.sqrt(a);
    }
}
