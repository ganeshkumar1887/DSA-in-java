import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;

        // Reverse logic
        while (number != 0) 
        {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed number
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed Number: " + reversed);
        scanner.close();
    }
}