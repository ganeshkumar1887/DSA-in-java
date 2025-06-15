import java.util.Scanner;
class check_char
{
public static void main(String[] a)
	{
	char ch;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter charecter::");
	ch=s1.next().charAt(0);
	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))  
        {  
        System.out.println("This is an alphabet");
        }  
        else if(Character.isDigit(ch))  
        {  
        System.out.println("This is a digit"); 
        }  
        else   
        {  
        System.out.println("This is a special character");  
        }  
}
}