class Jack {
    String jackColor="Green";
    void colorName(){
        System.out.println(jackColor);
    }
    static class Oggy extends Jack {
        @Override
        void colorName(){
            super.colorName();
            System.out.println("Blue");
        }
    }
}
class InnerClass {
    public static void main(String[] args) {
        Jack.Oggy a = new Jack.Oggy();
        a.colorName();
    }
}
