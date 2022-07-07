public class InterfaceDemo2 {
    public static void main(String[] args)
    {
      /*   
        B ob1=new B();
        ob1.show();
        ob1.display();
        By using the above 3 statements, I can access both the methods of B.
        But, if I do not want the user to access method display(),then what is the solution?
        I cannot create an object of A as A is an interface.Then?Solution below
        */
        A ob2=new B();//create an object of A but with memory of B
        ob2.show();
        //ob2.display();this statement is not possible and hence I cannot access display() method

    }
    
}
interface A
{
    public void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("Hello 1");
    }
    public void display()
    {
        System.out.println("Hello 2");
    }
}
