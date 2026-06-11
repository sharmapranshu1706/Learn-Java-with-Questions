class customer {
     static String name;
    static int shopNo;
    static char file;
    customer(){
        name="X";
    }
    static void display(){
        System.out.println("Name: "+name+",  Sign: "+file+",  Shop No."+shopNo);
    }
}
class Shop {
    public static void main(String[] args) {
        customer customer=new customer();
        customer.shopNo =1;
        customer.file ='A';
        customer.display();
    }
}
