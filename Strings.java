public class Strings{

    public static void main(String[] args) {

    String name = "Arpit"; // Strings are immutable datatype. The data is stored in String Constant Pool [ an area in heap memory where Java stores literal string values ]
    name = name + "Bhardwaj"; // Whenever you try to manipulate the String data, it will create a new object in the SCP and assing the address in the Stack memory.
    name = "Arpit Bhardwaj";
    System.out.println(name);
        
    }
    
}