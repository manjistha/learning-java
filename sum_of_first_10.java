//WAP to print the sum of the first 10 natural numbers
class sum_of_first_10
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of the first 10 natural numbers is "+sum);
    }
}