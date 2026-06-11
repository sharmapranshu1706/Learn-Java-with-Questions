class method1 {
    public int loading2(int a,int b){
        return a+b;
    }
    public double loading2(double a,double b){
        return a+b;
    }
}
class methodOverloading{
    public static void main(String[]args){
        method1 meth=new method1();
        int result=meth.loading2(10,20);
        int result2=meth.loading2(10,20);
        System.out.println(result2);
        System.out.println(result);
    }
}
