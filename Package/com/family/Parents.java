package com.family;

class Parents {
    protected int age=48;
    //private method can be accessed only within the class
    //private variable can be accessed only within the class
    //getter and setter for private variable age.

    // public int getAge() {
    //     return age;
    // }   

    public void setAge() {
        System.out.println("Age of parents is: "+age);
    }
   
}
