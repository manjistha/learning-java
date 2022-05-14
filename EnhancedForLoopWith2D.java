import java.util.*;
public class EnhancedForLoopWith2D {
    public static void main(String[] args)
    {
        int[][] arr=new int[4][5];
        Random r=new Random();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=r.nextInt(20);
            }
        }
        System.out.println("The values of the 2d matrix are:");
        for(int i[]:arr)
        {
            for(int j:i){
                System.out.print(j+"   ");
            }
            System.out.println();
            
        }
    }
    
}
