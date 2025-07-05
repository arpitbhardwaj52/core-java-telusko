/*
 * The below class will explain the concept of enums.
 * Enum is a special datatype in Java and is a group of named constants related to each other (may or may not).
 * Enum constants are implicitly static and final, that's why no object is instanciated for an enum.
 * enum implictly extends java.lang.Enum class, that's why it can't extend any class or enum.
 * Constructor for each and every constant is called once, no matter which constant is being used in the initialization.
 */

enum TrafficLightColour {
    RED, YELLOW, GREEN;

    TrafficLightColour(){
        System.out.println("Constructor called for the ENUM : " + this.toString());
    }

    void trafficFlow(TrafficLightColour eNum){
        if(eNum==RED){
            System.out.println("Stop the vehicle");
        }
        if(eNum==YELLOW){
            System.out.println("Start the vehicle");
        }
        if(eNum==GREEN){
            System.out.println("Move the vehicle");
        }
    }
}

public class Enums {
    public static void main(String[] args) {
        TrafficLightColour t1 = TrafficLightColour.RED; //No object instantiation happening here.
        t1.trafficFlow(t1);
        System.out.println(t1.ordinal());

        TrafficLightColour t2 = TrafficLightColour.YELLOW; //No object instantiation happening here.
        t2.trafficFlow(t2);
        System.out.println(t2.ordinal());

        TrafficLightColour t3 = TrafficLightColour.GREEN; //No object instantiation happening here.
        t3.trafficFlow(t3);
        System.out.println(t3.ordinal());
    }
}
