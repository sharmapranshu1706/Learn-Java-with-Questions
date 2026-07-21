class Son {
    String name="Pranshu";
}
class Father extends Son{
    String name="Mr. Mukesh";
    void show(){
        System.out.println(super.name);
        System.out.println(name);
    }
    public static void main(String[] a){
        Father f = new Father();
        f.show();
    }
}
