/* 
 * This class will tell about anonymous and refrenced objects and their differences.
 */
public class AnonymousObjects {

    public AnonymousObjects(){
        System.out.println("Executing constructor");
    }

    public void show(){
        System.out.println("Executing method show ()");
    }


    public static void main(String[] args) {
        new AnonymousObjects(); //Here an anonymous object is created, this object can be used only once.
        new AnonymousObjects().show(); // Here we are creating another anonymous object and calling show method using the anonymous object.
        AnonymousObjects object1 = new AnonymousObjects(); // Here we are creating a referenced object and the object is refrenced via variable "object1".
        object1.show();
    }
}
