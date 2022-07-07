import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args)
    {
        int n;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array list:");
        n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>(n);
        System.out.println("Enter the elements of the arraylist");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element"+(i+1));
            a.add(i);
        }
      
        System.out.println(a);
        a.remove(4);
        //printing the elements one by one
        for(int i=0;i<a.size();i++)
        {
            System.out.println(i+"th element is "+a.get(i));
        }
    }
    
}
