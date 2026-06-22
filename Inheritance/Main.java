public class Main {
    public static void main(String[] args) {
        ScientificCalc advCalc = new ScientificCalc();
        int sum = advCalc.add(10, 5);
        int difference = advCalc.subtract(10, 5);
        int product = advCalc.multiply(10, 5);
        int quotient = advCalc.divide(10, 5);
        int power = advCalc.power(2, 3);
        int squareRoot = advCalc.squareRoot(25);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Power: " + power);
        System.out.println("Square Root: " + squareRoot);
    }

}
