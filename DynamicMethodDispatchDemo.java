//runtime polymorphism
public class DynamicMethodDispatchDemo {
    public static void main(String[] args)
    {
        A ob1=new A();
        B ob2=new B();
        A x;
        x=ob1;
        x.show();//it displays show() of A
        x=ob2;
        x.show();//if displays show() of B.It does not matter which class's
        //instance is created as long as the object of the class is there, it is fine.
    }
}
class A
{
    public void show()
    {
        System.out.println("In Show A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In Show B");
    }
}