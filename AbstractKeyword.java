/*
 * This class will expain the Abctract keyword, it's usage and significance.
 * There are two types of classes Concrete Class and Abstract Class.
 * Abstract keyword is a non-access modifier in Java.
 * Abstract keyword can be used with methods to make them abstract methods and a class to make it an abstract class.
 * Abstract Method : It is type of method that doesn't have an actual implementation and the implementation needs to be done by overriding the method in a concrete sub-class.
 * Abstract methods can only be created inside an abstract class.
 * Abstract Class : It is a type of class that may or may not contain any abstract method.
 * Object of Abstract class can't be instanciated.
 * 
 * Abstract classes can have constructors: Abstract classes can have constructors, which are used to initialize instance variables and perform other initialization tasks.
 * However, because abstract classes cannot be instantiated directly, their constructors are typically called constructors in concrete subclasses.
 * 
 * Abstract classes can implement interfaces: Abstract classes can implement interfaces, which define a set of methods that must be implemented by any class that implements the interface. 
 * In this case, the abstract class must provide concrete implementations of all methods defined in the interface.
 * 
 * The following are various illegal combinations of other modifiers for methods with respect to abstract modifiers: 
    final
    abstract native
    abstract synchronized
    abstract static
    abstract private
    abstract strict
 * All the abstract methods must be implemented by any of the sub-class.
 * 
 */


abstract class Car //The class must be made abstract class as it contains one abstract method.
{
    public abstract void drive(); //Declaration of abstract method.
    public abstract void fly();

    public void playMusic(){ //Concrete method of abstract class.
        System.out.println("Playing music...");
    }
}

abstract class SkodaSlavia extends Car{ //Since there are 2 abstract methods in class and only 1 being implemented, we need to make this class also an abstract class.
    public void drive(){
        System.out.println("Driving Skoda Slavia...");
    }
}

class UpdatedSkodaSlavia extends SkodaSlavia{ //This is extending SkodaSlavia, that's why only 1 remaining abstract method is needed to be implemented.
// If we extend Car class then both the methods were needed to be implemented otherwise this class would need to be made as an abstract class.
    public void fly(){
        System.out.println("Flying Skoda Slavia...");
    }
}
public class AbstractKeyword {

    public static void main(String[] args) {
        //Car obj = new Car(); //This is not possible as we can't instanciate the object of an abstract class.
        //Car obj = new SkodaSlavia(); //This is also not possible as we can't instanciate the object of an abstract class.

        Car obj = new UpdatedSkodaSlavia();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
    
}
