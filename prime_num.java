public class prime_num 
{
    public static void main(String[] args) 
    {
        System.out.println("Prime number between 1 to 1000 ::");
        for(int num=2;num<=1000;num++)
        {
            if(isprime(num))
            {
                System.out.print(num+" ");
            }
        }
    }
    public static boolean isprime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
            }
        return true;
    }
}
