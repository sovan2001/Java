class Phone
{
    public void greet()
    {
        System.out.println("Good Morning");
    }
    public void on()
    {
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Namaste");
    }
    public void on()
    {
        System.out.println("Turning on SmartPhone");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        //As SmartPhone has all the properties of a phone
        //But a phone may not have all the properties of a SmartPhone
        //AS a phone is the parent class and smartphone is the child class

        Phone obj = new SmartPhone();   //Works As the reference is a superclass

        //SmartPhone obj2 = new Phone();  //Gives error as the reference is the
                                        //child class of which it is referncing to  
        //A superclass reference can be equal to an object of subclass but vice-versa is
        //not allowed.
        // SuperClass obj = new SubClass is allowed
        // SubClass obj = new SuperClass is not allowed
        
        obj.greet();    //SuperClass function

        //obj.swagat();   // Not Allowed as the reference is the super class that doesn't
                        // have functions of sub class

        obj.on();       // This will go inside the function of subclass as it gets
                        // overwritten in subclass.
    }        
}
