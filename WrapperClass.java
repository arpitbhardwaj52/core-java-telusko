/*
 * This class will explain the wrapper classes, Boxing, Unboxing, Auto-Boxing and Auto-Unboxing.
 * Wrapper classes in Java are classes that encapsulate primitive data types within objects.
 * Each primitive type in Java (e.g., int, char, float, double, boolean, byte, short, long) has a corresponding wrapper class (e.g., Integer, Character, Float, Double, Boolean, Byte, Short, Long).
 * The use is when we are dealing with Collections, that only takes objects.
 * Boxing is the process of converting a primitive type value into an object of its corresponding wrapper class.
 * Unboxing is the process of converting back the object of wrapper class into it's primitive type value.
 * JAVA supports auto-boxing and auto-unboxing.
 */
public class WrapperClass {
    @SuppressWarnings({ "removal"})
    public static void main(String[] args) {
        int primitiveInteger1 = 10;
        Integer wrrapInteger1 = new Integer(20); //This is called boxing, and it is deprecated now.
        int primitiveInteger2 = 30;
        Integer wrrapInteger2 = 40; // This is called auto-boxing.
        int primitiveInteger3 = 50;
        Integer wrrapInteger3 = primitiveInteger3;
        int primitiveInteger4 = wrrapInteger3.intValue(); // This is called unboxing.
        int primitiveInteger5 = wrrapInteger3;

        System.out.println(primitiveInteger1);
        System.out.println(wrrapInteger1);
        System.out.println(primitiveInteger2);
        System.out.println(wrrapInteger2);
        System.out.println(primitiveInteger3);
        System.out.println(wrrapInteger3);
        System.out.println(primitiveInteger4);
        System.out.println(primitiveInteger5);

    }
}
