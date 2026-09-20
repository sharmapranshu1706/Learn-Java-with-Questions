class LuLu {
    int presentTime = 2;
    void available(){
        System.out.println("2 Years");
    }
}
class AnonymousInnerClass extends LuLu{
    public static void main(String[] args){
        LuLu l = new AnonymousInnerClass() {
            @Override
            void available() {
                System.out.println("Complete 2 Years");
            }
        };
        l.available();
    }
}
