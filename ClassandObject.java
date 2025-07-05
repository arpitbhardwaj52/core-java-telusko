public class ClassandObject{

    /*
     * Below are the Instance variables. Also called as Properties of class.
     */

    private int age;
    private String name;

    /*
     * Below is the method of the class.
     */

    private void showDetails(){
        System.out.println(age +  " " + name);
    }  

    public void setAge(int age) {
        this.age = age;
    }

    public ClassandObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main (String Args[]){
        ClassandObject obj1; // In this line of code we are giving reference of Class "ClassandObject"

        // obj1= new ClassandObject(); // In this line we are creating an object named "obj1" of class "ClassandObject"
        /*
         *  ✅ Java provides a default constructor only if no constructor is defined.
            ✅ If you define a constructor (custom one), the default constructor is not auto-generated.
            ✅ Manually define a no-args constructor if you need one.
            ✅ Always provide required arguments if only parameterized constructors exist.
         */
        obj1=new ClassandObject(21, "King");
        obj1.showDetails();
        obj1.setAge(22);
        obj1.setName("Eagle");
        System.out.println(obj1.getAge() + " " + obj1.getName());
        obj1.setAge(23);
        obj1.setName("Thomas");
        obj1.showDetails();

        obj1.age=24;
        obj1.name="Arpit";
        obj1.showDetails();

    }
}