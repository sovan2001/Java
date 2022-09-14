class Test
{
    int a;
    
    public void setA(int a) {
        this.a = a;                 //this is used if the referncing variable name is
                                    //same as the object variable
    }

    public int getA() {
        return a;
    }

    Test(int v)
    {
        a = v;
    }
}
class Child extends Test
{
    Child(int c)        //By default gives error as compiler automatically calls parent
    {                   //constructor and Test() doesn't have a default constructor
        super(c);       //So we use super keyowrd to pass c as parameter for Test().
        System.out.println("I am the child Constructor");
    }
}
public class this_super
{
    public static void main(String[] args) {
        Test obj = new Test(5);
        System.out.println(obj.getA());

        Child obj2 = new Child(65);
        System.out.println(obj2.getA());
    }
}