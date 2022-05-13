public class PatternOne{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if((i+j)>5)
                {
                    System.out.print(" "+(i+j-5));
                    
                }
                else
                {
                    System.out.print(" "+(i+j-1));
                }
            }
          
            System.out.println();
        }
    }
}



    

