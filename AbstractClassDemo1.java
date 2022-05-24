public class AbstractClassDemo1 {
    public static void main(String[] args)
    {
        Demo1 ob1=new Demo3();
        ob1.call();
        ob1.move();
        ob1.dance();
        ob1.sing();

    }
    
}
abstract class Demo1
{
    public void call()
    {
        System.out.println("Calling...");
    }
    abstract public void move();
    abstract public void dance();
    abstract public void sing();
}
abstract class Demo2 extends Demo1
{
    public void move()
    {
        System.out.println("Moving...");
    }
}
class Demo3 extends Demo2
{
    public void dance()
    {
        System.out.println("Dancing...");
    }
    public void sing()
    {
        System.out.println("Singing...");
    }
}
