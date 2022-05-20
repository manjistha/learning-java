public class ObjectCreationInInheritance {
    public static void main(String[] args)
    {
        B obj=new B(9);
        /*The output is the parameterized constructor in B and the call is
        done to the default constructor in A whenever child class's object
        is created.*/
    }
    
}
class A
{
    A()
    {
        System.out.println("In constructor A");
    }
    A(int x)
    {
        System.out.println(x+" in Parameterized Constructor A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("In Constructor B");
    }
    B(int x)
    {
        System.out.println(x+" in Parameterized Constructor B");
    }
}
