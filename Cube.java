wimport java.util.Scanner;
class Cube
{
public static void main(String[] a)
	{
	int i,cube;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a number for cube::");
	int num=s1.nextInt();
	for(i=1;i<=num;i++)
	{
	  cube=num*num*num;
	}
	System.out.print("number is"+cube);
        }
}
