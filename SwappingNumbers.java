public class SwappingNumbers {
  public static void main(String[] args)
  {
      int x=2,y=3;
      System.out.println("The numbers before swapping are: x="+x+" y="+y);
     x=x+y;
     y=x-y;
     x=x-y;
     System.out.println("The numbers after swapping are: x="+x+" y="+y);
  }  
}
