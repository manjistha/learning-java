public class ConstructorImplicitConversionDemo {
    public static void main(String[] args){
        Abc a=new Abc(10);
    }
   
}
class Abc{
    public Abc()
    {
        System.out.println("In Constructor");
    }
    public Abc(float d)
    {
        System.out.println("In Constructor double");
    }
}
