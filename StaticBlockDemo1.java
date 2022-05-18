//a static block gets called as soon as the Java class gets loaded in the JVM
public class StaticBlockDemo1 {
    static{
        System.out.println("In Static block 1");
    }
    static{
        System.out.println("In Static block 2");
    }
    public static void main(String[] args)
    {
        System.out.println("In Main");
    }
    static{
        System.out.println("In Static block 3 after Main");
    }
}
