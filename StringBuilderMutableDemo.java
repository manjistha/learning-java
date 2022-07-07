//StringBuilder class is not safe for synchronization purpose.This is the difference
//with StringBuffer class
public class StringBuilderMutableDemo {
    public static void main(String[] args)
    {
        StringBuilder sbd=new StringBuilder("Chayan ");
        sbd.append("Sengupta");
        sbd.reverse();
        System.out.println(sbd);
    }
    
}
