//a static block is generally used to initialize a static variable because constructors
//cannot be used there
public class StaticBlockDemo2 {
    static String d;
    static{
        d="1234";
    }
    public static void main(String[] args)
    {
        System.out.println("The value of d is:"+d);
    }
    
}
