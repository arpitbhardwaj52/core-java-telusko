/*
 * The below class will help in understand what constructors is and all related concepts.
 * Constructor is a special type of method which has no return type and it's name is same as that of the class. ->
 * -> Constructors are called each time when an object is created, to initialize the instance variables.
 * Constructors are of 2 types, default and parameterized.
 * If you don't specify any default constructor, then java creates it automatically.
 * If a parameterized constructor is created, then compiler doesn't create the default constructor automatically and needs to be created by programmer explicitly.
 */

public class Construtors {

    private int age;
    private String name;

    public Construtors() 
    {
        this.age = 21;
        this.name = "Arpit";

        //This is a default constructor and by default it is empty [same as when created by compiler], and if programmer wants, they can assign values here as well. ->
        // -> So, whenever an object will be created, those values will be assigned by-default.
    }

    public Construtors(int age) // This is a parameterized constructor, taking 1 param [age]
    {
        this.age = age;
    }

    public Construtors(String name) // This is a parameterized constructor, taking 1 param [name]
    {
        this.name = name;
    }
    
    public Construtors(int age, String name) // This is a parameterized constructor, taking 23params [age and name]
    {
        this.age = age;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("The name is : " + this.name + " and the age is : " + this.age);
    }

    public static void main(String[] args) {
        Construtors c1 = new Construtors();
        Construtors c2 = new Construtors(22);
        Construtors c3 = new Construtors("Bhardwaj");
        Construtors c4 = new Construtors(24, "Arpit Bhardwaj");

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
        c4.showDetails();

    }
    

    
    
}
