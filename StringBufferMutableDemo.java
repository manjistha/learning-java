//StringBuffer class is safe for inter-thread communication and synchronization.
public class StringBufferMutableDemo {
    public static void main(String[] args)
    {
        StringBuffer sbf=new StringBuffer("Manjistha");
        sbf.append("Paul");
        sbf.hashCode();
        sbf.delete(2, 10);
        System.out.println(sbf);
    }
    
}
