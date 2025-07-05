/*
 * The below class will explain the concept of Lambda expressions.
 * 
 * Lambda Expression only works with the functional interfaces because in case the interface contains more than 1 abstract method, it will become confusing/ambiguous.
 * If there are default, static or private methods, lambda expression will work fine just 1 abstract method should be there.
 * 
 * Syntax of Lambda Expression : (<Arguments/Parameters>) -> ({<Body of the function implementation>})
 */

interface LambdaExpressionInterface{
    void show();
}

interface SecondLambdaExpressionInterface{
    int mathematicalOperation(int A, int B);
}

class ImplementingClass implements SecondLambdaExpressionInterface,LambdaExpressionInterface{
    public void show(){
        System.out.println("Executing via Class implementation..");
    }
    public int mathematicalOperation(int A, int B){
        return A-B;
    }
}
public class LambdaExpression {
    public static void main(String[] args) {
        LambdaExpressionInterface interFace = () -> System.out.println("Executing Functional Interface show method using Lambda Expression ..");
        interFace.show();

        SecondLambdaExpressionInterface interFace2 = (a,b) -> a + b;
        SecondLambdaExpressionInterface interFace3 = (a,b) -> a * b;
        System.out.println(interFace2.mathematicalOperation(10,20));
        System.out.println(interFace3.mathematicalOperation(10,20));

        SecondLambdaExpressionInterface interFace4 = new ImplementingClass();
        System.out.println(interFace4.mathematicalOperation(1503,100));
    }
}
