/*
 * This class will explain the concepts of Object class and it's various methods.
 * By default java.lang* package is imported and Object class is extended by each class.
 * There are certain methods of Object class that can be overridden, such as toString, hashCode and equals.
 * Developer can either create their own overridden methods or use the ones that IDE provides.
 */

public class ObjectClass // Object class is implicitly being extended by this class.
{
    private int uniqueId;
    private String uniqueName;

    /*
     * Below is an overriden equals method to check if both the objects are equal or not.
     */

    public boolean equals(ObjectClass otherObject){
        return this.uniqueId == otherObject.uniqueId && this.uniqueName == otherObject.uniqueName;
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        obj1.uniqueId = 1;
        obj1.uniqueName = "Arpit";

        ObjectClass obj2 = new ObjectClass();
        obj2.uniqueId = 1;
        obj2.uniqueName = "Arpit";

        System.out.println(obj1.equals(obj2));

    }

}
