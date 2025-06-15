import java.util.Scanner;

public class Reverses 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For user input
        System.out.println("Enter a String:");
        String str = sc.nextLine(); // Read the input string

        // Call the reverseString method and print the result
        String reverse = reverseString(str);
        System.out.println("Reversed String: " + reverse);
    }
    public static String reverseString(String str) 
    {
        StringBuilder stringBuilder = new StringBuilder(str);   
        return stringBuilder.reverse().toString(); // Reverse and convert back to String
    }
}