//Java is 99.99% OOP. 0.01% not because it has dervied the concept of primitive data 
//types from C language
/*Boxing and unboxing is useful in the concept of collections where a value is passed
 * to an object.
 */
public class BoxingUnboxingDemo {
    public static void main(String[] args)
    {
        int var=12;
        Integer i1=new Integer(var);//Boxing where the variable is directly passed
        //to the Integer object
        Integer i2=var;//Autoboxing
        int j=i2.intValue();//Unboxing
        int k=i1;//Auto unboxing
        System.out.println(j);
        System.out.println(k);
    }
    
}
