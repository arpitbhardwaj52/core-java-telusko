
/*
 * ✅ Rules for Method Overloading -> 
 
    Same method name, but different method signatures.

    Methods must have different parameter lists:

    Different number of parameters.

    Different types of parameters.

    Different order of parameters (if types are different).

    Return type does NOT matter (only parameters define overloading).

    Method overloading happens inside the same class.

    It is also known as Compile-time polymorphism, also known as static polymorphism or early binding


 */

import java.util.Scanner;
public class MethodOverloading {

    private int rollNo;
    private String name;

    private void showstudentDetails(){
        System.out.println("Nothing to see here");
    }

    private void showstudentDetails(int rollNo){
        this.rollNo=rollNo;
        System.out.println(rollNo);
    }

    private void showstudentDetails(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        MethodOverloading obj;
        obj= new MethodOverloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        obj.showstudentDetails();
        obj.showstudentDetails(rollNo);
        obj.showstudentDetails(rollNo, name);
        sc.close();

    }
    
}
