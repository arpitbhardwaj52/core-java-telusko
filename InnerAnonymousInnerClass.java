/*
 * This class will help in understanding Inner Class, Anonymous Inner class and their usage.
 * An Inner class is a class that is defined inside another class.It allows for logical grouping of classes that are used in one place, increases encapsulation, and can lead to more readable and maintainable code.
 * Inner classes can access members of the outer class, including private members.
 * 
 * In Java, you cannot call a method of the outer class using an inner class object in the format: innerObject.outerMethod(); // ❌ Not allowed
 * 
 * Always use OuterClassName.this.OuterClassMethodOrVariable for removing ambiguity anyways it's optional.
 * 
 * Anonymous Inner Class is the class that has no defination inside the Outer Class and the defination is given while object instantiation.
 * 
 * Anonymous Inner Class are great usage when implementing interface or an abstract class just once.
 */

abstract class Animal
{
    public abstract void makeSound();
}

class Human{
    private int age = 24;
    private String name = "Arpit Bhardwaj";
    public void showDetails(){
        System.out.println("Name is : " + name + " age is : " + age);
    }
    public class UniqueIdentity //This is an example of inner class.
    {
        int uniqueIdentity = 1403;
        public void showUniqueDetails()
        {
            System.out.println("UniqueID is : " + this.uniqueIdentity +" Name is : " + Human.this.name + " age is : " + Human.this.age);
            //System.out.println("UniqueID is : " + this.uniqueIdentity +" Name is : " + name + " age is : " + age); //This also works fine but above line is more readable and non-ambiguos.
        }

    }
}
public class InnerAnonymousInnerClass {

    public static void main(String[] args) 
    {
    Human outerObject = new Human();
    Human.UniqueIdentity innerObject = outerObject.new UniqueIdentity(); //Syntax of accessing inner class.
    innerObject.showUniqueDetails();
    
    Animal animalObject = new Animal() {
        public void makeSound(){
            System.out.println("The animal is making sound");
        }
    };
    animalObject.makeSound();
    }
    
}
