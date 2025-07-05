/*
 * This class will be used to describe the static variable, static methods and static block
 */

public class StaticKeyword {
    String name;
    int mobileNumber;
    private static boolean human; // static keyword is used to declare the variable.

    private void details(){
        /*
         * We can access the static variable in an instance method but the vice versa is not possible.
         */
        System.out.println("Name : " +  name + " Mobile Number : " +  mobileNumber + " Is Human : " +  human);
    }

    /*
     * Below is a static method and as mentioned above we can't access the non-static variable [instance variable] directly without using a refrence of object
     */

    private static void showDetails(StaticKeyword object){
        System.out.println("Name : " +  object.name + " Mobile Number : " +  object.mobileNumber + " Is Human : " +  human);
    }

    /*
     * Below is the default constructor.
     * Constructor is called each time, when an object is initialized.
     */

    public StaticKeyword(){
        this.name = "Arpit";
        this.mobileNumber = 123;
        System.out.println("Executing default constructor");
    }

    /*
     * Below is the static block.
     * This static block is executed once the class is loaded in the Class loader of JVM.
     */
    static{
        human = true;
        System.out.println("Executing the static block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        StaticKeyword stk1= new StaticKeyword();
        stk1.details();
        StaticKeyword stk2 = new StaticKeyword();
        StaticKeyword.showDetails(stk2);

        //Class.forName("StaticKeyword"); //This line of code loads the class into JVM and later helps in executing the static block
    }






}
