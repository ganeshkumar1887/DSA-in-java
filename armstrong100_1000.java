public class armstrong100_1000 
{
    public static boolean isArmstrong(int n)
    {
        int sum =0;
        int originalNum = n;
        int temp = n;
        while(n>0)
        {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n/=10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args) 
    {
        System.out.println("Armstrong between 100 to 1000::");
        for(int i = 100;i<1000;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i+" ");
            }
        }
    }    
}
