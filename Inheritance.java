/* 
 * This class wille explain the concepts of inheritance, is and has a relationship.
 * In Java Multi-Level inheritance is allowed.
 * In Java Multiple Inheritance is now allowed due to ambiguity problem. Though, it is possible by using interfaces.
 * By chance I also discovered a case of Inner Class.
 */
public class Inheritance {

    class BasicCalculator{
        public int add(int a, int b){
            return a+b;
        }

        public int subtract(int a, int b){
            return a-b;
        }
    }

    class AdvancedCalculator extends BasicCalculator{
        public int multiply(int a, int b){
            return a*b;
        }

        public float divide(int a, int b){
            return a/b;
        }
    }

    class ScientificCalculator extends AdvancedCalculator{
        public double power(int a, int b){
            return Math.pow(a, b);
        }
    }

    public static void main(String[] args) {
        Inheritance outerClassObject = new Inheritance(); //Since the main is defined in Inheritance class, so need to create an object of Inheritance first.
        BasicCalculator obj1 = outerClassObject.new BasicCalculator(); // BasicCalculator is an inner class of Inheritance class, that's why we need an object of Outerclass first and then using the reference variable of that object we can create an object of inner class.
        System.out.println(obj1.add(10, 5) + " " + obj1.subtract(20, 10));

        AdvancedCalculator obj2 = outerClassObject.new AdvancedCalculator();
        System.out.println(obj2.add(10, 5) + " " + obj2.subtract(20, 10) + " " + obj2.multiply(10, 5) + " " + obj2.divide(20, 10)); // Derived class is able to use the methods of Base class.

        ScientificCalculator obj3 = outerClassObject.new ScientificCalculator();
        System.out.println(obj3.add(10, 5) + " " + obj3.subtract(20, 10) + " " + obj3.multiply(10, 5) + " " + obj3.divide(20, 10) + " " + obj3.power(4, 2)); // Multilevel inheritance example
    }
    
}
