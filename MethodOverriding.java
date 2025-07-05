/*
 * This class will explain the concept of Method Overriding.
 * It is also known as Run-Time Polymorphism or Dynamic Method Dispatch or Late binding.
 * The subclass method must match the parent class method's name, parameters, and return type.
 * It happens in different classes.
 */

class ParentClass{
    public void show(){
        System.out.println("Executing parent method...");
    }
}

class ChildClass extends ParentClass{
    public void show(){
        System.out.println("Executing child method...");
    }
    public void showChild(){
        System.out.println("Executing child extra method...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        obj1.show();
        /* 
            If a Parent type reference refers to a Child object Child's show() is called. 
            This is called RUN TIME POLYMORPHISM. 
        */
        ParentClass obj2 =  new ChildClass(); //UpCasting
        obj2.show();
        ChildClass obj3 = new ChildClass();
        obj3.show();
        ChildClass obj4 = (ChildClass)obj2;  //Downcasting
        obj4.show();
    }
}
