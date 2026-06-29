package com.family;

 class child extends Parents{
        void displayAge(){
            //System.out.println("Age of parents is: "+age); //This will give error because age is private in Parents class
            //This will give error because showAge() is private in Parents class
            setAge(); //This will work because setAge() is public in Parents class
        }
        

}
