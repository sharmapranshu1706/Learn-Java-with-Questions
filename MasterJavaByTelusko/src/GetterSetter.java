class GetterSetter {
        private int age;
        private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        GetterSetter obj =new GetterSetter();
        obj.setName("Pranshu");
        obj.setAge(22);
        System.out.println("Name: "+ obj.getName() + "  Age is: "+obj.getAge());
    }
}
