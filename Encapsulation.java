/*
 * Below class will walk through the encapsulation concept of OOP and concept of "this" keyword.
 * Encapsulation = It is the process of wrapping the variables and methods working on a data, into a single unit called as class.
 * Encapsulation is used to hide the internal implementation details of a class.
 * Encapsulation ensures data protection and security.
 * 
 * "this" keyword refers to the current object which is calling the method.
 */

public class Encapsulation {
    private String name; // "private" is an access modifier that ensures that the declared variable or method is only accessible within the class.
    private int age;
    public void getDetails() // "public" is also an access modifier that ensures that the variable or method is accessbile everywhere, even outside the class.
    {
        System.out.println("The name is : " + name + " and the age is : " + age);
    }

    public void setDetails(String name, int age){
        this.name = name; // "this" keyword is used to specify that particular varible is an instance variable and not a local variable.
        this.age = age; // priority is given to local variables, that's why, if you don't use this keyword then it will try to self assign the value to the local variable.
    }
}

class ExecutionClass{

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        // en.age=21;
        // en.name="Tushar"; //This will not work as the variables are private and you can't access them from outside the class/
        en.setDetails("Arpit Bhardwaj", 23);
        en.getDetails();
    }

}