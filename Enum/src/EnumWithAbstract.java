enum Operations {
    ADD("+"){
        @Override
        public int apply(int a, int b){
            return a + b;
            }
        },
    SUBTRACT("-") {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        },
    MULTIPLY("*") {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVISION("/") {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    };
    private final String symbol;
    Operations(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol(){
        return symbol;
    }
    public abstract int apply(int a, int b);
}
public class EnumWithAbstract{
    public static void main(String[] args) {
        for (Operations op : Operations.values()) {
            System.out.println("10" + op.getSymbol() + "5 = " + op.apply(10, 5));
        }
    }
}
