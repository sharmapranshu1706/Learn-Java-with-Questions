class Example {
    static int id;
    static String name;
    static {
        name="Ayush";
    }
    static void display() {
        id = 16;
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
    public static void main(String[] args) {
        Example.display();
        Example obj = new Example();
        obj.name="Rahul";
        System.out.println(Example.name);
    }
}
