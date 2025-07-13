/*
 * This class will explain the concepts Errors and Exceptions.
 * Exceptions are the run-time errors that occur and disrupts the normal flow of the program's execution.
 * Exception handling is done to handle such unwanted situation and keep the flow of the program's execution uninterrupted.
 * 
 * There are 2 types of exceptions -> Checked [Compiler asks to handle the exception] and Unchecked.
 * 
 * Errors and Exceptions are SubClass of Throwable class.
 * 
 * JVM maintains the method execution stack and once an exception is occured, it backtraces to the method from which the exception occured -
 * - and if any "try-catch" block is found, the exception object is passed in the catch block and the control is given to the catch block -
 * - If no catch block is found, the default handler will abrupt the program execution and print the exception message and it's stack trace.
 * 
 * Exception propagation is the process where an unhandled exception in a method is passed up the call stack to the calling method, and so on, until it's caught and handled or it reaches the top of the stack
 * 
 * Exception Class is parent class for all the other exception classes like arthimetic exception. So generally the parent class is used -
 * - in the last catch block.
 * 
 * For multiple exceptions, we need to write multiple catch blocks.
 * 
 * Finally Block will be called each time independent of if exception occurs or not.
 * 
 * Rules for method overriding:
 * -> If superclass is throwing a checked exception, subclass can either the same exception, any subclass of that exception or no exception at all -
 * - however it can't throw any unrelated checked exception. Also it can't throw any new checked exception.
 * -> For unchecked excpetion, there is no such rule.
 */

interface LambdaExpressionExceptionHandling {
    void divideMethod(int a, int b);
}

public class ExceptionHandling {
    public static void main(String[] args) {
        
        int divisor = 10;
        int divident = 0;
        int array1[] = new int[5];

        // System.out.println(divisor/divident); //Exception in thread "main" java.lang.ArithmeticException: / by zero at ExceptionHandling.main(ExceptionHandling.java:22)
        // System.out.println("This line will not get executed because the exception is not handled.");
        try{
            System.out.println(divisor/divident);
            System.out.println(array1[5]);

        } catch(ArithmeticException e){
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        } finally{
            System.out.println("This block will get executed each time.");
        }

        System.out.println("This line will get executed because the exception is handled.");

        LambdaExpressionExceptionHandling lambda = (a,b) -> {
            try{
                if(b==0){
                    throw new ArithmeticException("Can't divide by zero");
                }
                System.out.println(a/b);
            } catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        };
        lambda.divideMethod(10, 0);
    }
}
