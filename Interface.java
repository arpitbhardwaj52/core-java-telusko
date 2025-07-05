/*
 * This class will explain the interface of Java language.
 * All the methods of the interface must be implemented in the concrete class Implementing the Interface.
 * The variables declared in the interfaces are by default public static final.
 * Multiple interfaces can be implemented, but it's not true for abstract class.
 * Multi-level inheritance is possible with interfaces too, we need to write "extends" for doing so.
 * 
 * Post Java 8, now Interfaces can have methods apart from abstract methods [method without a body].
 * Interfaces can have default methods, static methods and private methods.
 * 
 * Default Methods are those methods of Interface that helps interface in proving a default implementaion of a method, the class implementing the interface can use this default implementaion or override it.
 * 
 * Static methods of interfaces can be called anywhere in the code.
 * 
 * Private methods or Helper methods are the private methods that help the default and static methods and hide the actual implementation from the implementing class.
 * 
 * There are 3 types of interfaces in Java. Normal [2 or more than 2 abstract methods declared.], Functional/SAM(Single Abstract method), Marker [Interface with no methods]
 */

interface details {
    int rollNo = 21;
    String name = "Arpit";
    void displayDetails();
    void fudduMethod();

    default void defaultMethod(){ //It is not necessary that this method needs to be overriden or implemented in the implementing class.
        System.out.println("This is the default implementation of the interface..");
    }

    static void staticMethod(){
        System.out.println("This is a static method of interface");
    }

    default void additionMethod(int a, int b){
        add(a,b);
    }
    private void add(int a, int b){
        System.out.println(a+b);
    }
    
}
public class Interface implements details{

    @Override
    public void displayDetails() {
        System.out.println("The details are : " + rollNo + " " + name);
    }

    @Override
    public void fudduMethod() {
        System.out.println("Fuddu method is running...");
    }

    public void nonInheritedMethod() {
        System.out.println("nonInheritedMethod is running...");
    }
    public void defaultMethod(){
        System.out.println("This is the overrided implementation of default method of interface..");
    }
    
    public static void main(String[] args) {
        details obj1;
        obj1 = new Interface();
        obj1.displayDetails();
        obj1.fudduMethod();
        obj1.defaultMethod();
        details.staticMethod();
        obj1.additionMethod(10, 20);
        //obj1.nonInheritedMethod(); //This will give error as this method is not defined in the interface

        Interface obj2;
        obj2 = new Interface();
        obj2.displayDetails();
        obj2.fudduMethod();
        obj2.nonInheritedMethod();
        obj2.defaultMethod();
        obj2.additionMethod(100, 200);

        System.out.println(Interface.name);
        System.out.println(details.name);
        System.out.println(Interface.rollNo);
        System.out.println(details.rollNo);
    }
}

