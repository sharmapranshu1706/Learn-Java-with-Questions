interface Computer  {
    void code();
}
class Laptop implements Computer{
    public void code() {
        System.out.println("A developer do code on a laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("A Developer do a code on a Desktop");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
class InterfaceImportance{
    public static void main(String[] args){
        Computer a = new Laptop();
        Computer b = new Desktop();
        Developer dev = new Developer();
        dev.devApp(a);
        dev.devApp(b);
    }
}
