public class ConstructorOverloadingDemo {
    public static void main(String[] args)
    {
        Abc ob=new Abc(9,1.0);
    }
    
}
class Abc{
    public Abc()
    {
        System.out.println("In Constructor");
    }
    public Abc(int a)
    {
        System.out.println(a+" In Parameterized Constructor 1");
    }
    public Abc(int a,double x)
    {
        System.out.println(a+" "+x+" In Parameterized Constructor 1");
    }
    }

