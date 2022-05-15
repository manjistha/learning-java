public class StaticMethodDemo {
    public static void main(String[] args)
    {
        Abc.x=10;
        Abc.show();
        
    }
}
//for a static method, we do not need to create any object of the class
class Abc{
    static int x;
    public static void show()
    {
        System.out.println("Hello World in show() method.");
        System.out.println("The value of x in show() method is "+x+".");
    }
}
