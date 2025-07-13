/*
 * This class will explain how to create custom exceptions and use of "throw" keyword.
 * 
 * If you create a custom exception class then you need to extend "Exception" class as a parent class.
 * Throw keyword is used to throw an exception even though it didn't occur and we can also send some custom message along with it.
 * 
 * "Throws" keyword is used to throw the exception from the method where Exception aroused to the method which is calling it. - 
 * - Now that method is responsible for exception handling.
 * 
 * At last we must handle everything in the main method and shouldn't throw any exception from main method.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(String errorMessage){
        super(errorMessage);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the user : ");
        age = sc.nextInt();
        try{
            if(age<18)
            {
                throw new AgeException("Kudiye tu under-age");
            }
            else{
                System.out.println("You are old enough!!");
            }
        } catch(AgeException ageException){
            System.out.println(ageException.toString());
        } finally{
            sc.close();
        }
        try{
            throwingException(); // Here we can either throw the exception from main, but JVM will catch is and it's not recommened.
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void throwingException() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("What is your name?");
        String name = br.readLine(); // This is a critical line and raises IO Exception.
        System.out.println(name);
    }

}
