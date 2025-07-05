/* 
 * This class will explain the concepts of Super(), This() methods. Both of these methods can't be called in a single constructor at the same time.
 * super() -> Used for calling the constructor of parent class.
 * this() -> Used for calling the default constructor of same class.
 * super() is called by default in each and every constructor.
 * You need to write this() method explicitly.
 * Both the methods should be the first line of code in constructor. That's why one at a time can be used.
 * The execution starts from the Super class constructor and then the Sub class constructor.
 * this() function can't be used in default constructor as it will cause stackoverflow error due to recursive call of default constructor.
 */

class A{

    public A(){
        System.out.println("Inside default constructor of A.");
    }

    public A(int n){
        this(); // To call the default constructor of A.
        System.out.println("Inside parameterized constructor of A.");
    }

}

class B extends A{
    public B(){
        super(5); // Just to call the parameterized constructor of A.
        System.out.println("Inside default constructor of B.");
    }

    public B(int n){
        this(); // To call the default constructor of B.
        System.out.println("Inside parameterized constructor of B.");
    }
}

public class ThisAndSuperMethods {
    @SuppressWarnings(value = { "unused" })
    public static void main(String[] args) {
        B obj = new B(); // It will call the default constructor of B and then default constructor of A.
        B obj1 = new B(5); // It will call the parameterized constructor of B and then default constructor of A.

        /*
         * If you use this() method, the call will go to param const of B, then default const of B, then param const of A and finally default const of A
         */
    }
}
