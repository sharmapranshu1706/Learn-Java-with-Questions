class Feature0 {
    String autoRead="This is auto read only variable";
    char autoReadWrite='A';
    void run() {
        System.out.println("Feature0 is Available"+autoRead+autoReadWrite);
    }
}
class Feature1 extends Feature0 {
    void run() {
        super.run();
        System.out.println("Feature1 is Available"+autoRead+autoReadWrite);
    }
    public static void main(String[] args){
        Feature1 f1=new Feature1();
        f1.run();
    }
}
