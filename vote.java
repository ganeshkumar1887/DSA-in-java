import java.util.Scanner;
class vote
{
	public static void main(String[] a)
	{
	int age;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter age::");
	age=s1.nextInt();
	if(age>18)
	{
	System.out.println("Congratulation! You are eligible for casting your vote::");
	}
	else
	System.out.println("you are not eligible for casting your vote::");
	}
}