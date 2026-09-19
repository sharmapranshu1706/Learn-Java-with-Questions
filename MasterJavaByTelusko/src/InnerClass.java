class Box{
    int age;
    void show(){
        System.out.println("Boxing");
    }
    class UnBox{
        void show(){
            System.out.println("Unboxing");
        }
    }
}
class InnerClass{
    public static void main(String[] args){
        Box b = new Box();
        b.show();
        Box.UnBox u = b.new UnBox();
        u.show();
    }
}
