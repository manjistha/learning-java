public class ObjectCounter {
    public static void main(String[] args)
    {
        XYZ ob1=new XYZ();
        XYZ ob2=new XYZ();
        
        XYZ ob3=new XYZ();
        ob3.show();
    }
}
class XYZ{
 static int count;
//count is a class variable because now the value of count will be shared by all
//objects of the class and also by default it is initialized to 0
    public XYZ()
    {
        count++;
    }
    public void show()
    {
        System.out.println("The number of objects created are: "+count);
    }
}

