class Human {
    private final int age;
    private final String name;
    private final char standard;

    private Human() {
        this("Unknown", 0, 'U');
    }

    private Human(String name, int age, char standard) {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

    public static void main(String[] args) {
        Human obj = new Human("John", 30, 'A');
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Standard: " + obj.standard);
    }
}