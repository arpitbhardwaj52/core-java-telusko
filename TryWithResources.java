/*
 * This class will explain the try-with-resources block and it's concepts.
 * 
 * Try-with-Resources introduced in Java 7 — allows us to declare resources to be used in a try block with the assurance that the resources will be closed after the execution of that block.
 * 
 * Catch and Finally blocks are optional with try-with-resource block.
 * 
 * Syntax => try(<First Resource Declaration>; <Second Resource Declaration>;...<nth Resource Declaration){ <...Statement Block...>}
 * 
 * The closeoure of all the declared resources happen automatically in reverse order of their declaration.
 * 
 * The class must implement AutoCloseable interface, in case you want to create your own resource class.
 */

import java.util.Scanner;

class MyCustomResource implements AutoCloseable{
    private boolean isConnected;
    public MyCustomResource(){
        isConnected=true;
        System.out.println("Resource connected..");
    }
    public void performAction(){
        if(isConnected){
            System.out.println("Performing action...");
        }
        else{
            throw new IllegalStateException("Resource is not connected");
        }
    }
    @Override
    public void close(){
        isConnected = false;
        System.out.println("Resource is disconnected");
    }
}
public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name ?");
            String name = sc.nextLine();
            System.out.println("Your name is : " + name);
        }
        // Below is the implementation when MyResource does implements the autocloseable interface.
        /*
        try{
            MyCustomResource resource = new MyCustomResource();
            resource.performAction();
            resource.close();
        } catch( IllegalStateException e){
            System.out.println(e.getMessage());
        } */

        try(MyCustomResource resource1 = new MyCustomResource()){
            resource1.performAction();
        }
    }
}
