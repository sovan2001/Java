interface Human{
    void sayHello();
    void greet();
}

abstract class Parent2 implements Human
{
    public Parent2() {
        System.out.println("Constructor Of Parent 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Ohiao");    //Overriding Function
    }
}

abstract class Child3 extends Parent2{
    public void func(){
        System.out.println("Not Overriding the Function but Still Inheritance works as Class is made abstract");
    }
}

public class abstract_class_interface {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        //Child3 obj2 = new Child3();     //Abstract Class can't create object
        //Parent2 obj3 = new Parent2();   //Same
        obj.sayHello();
    }
}
