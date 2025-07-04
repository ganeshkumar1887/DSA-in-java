import java.util.Scanner;

public class fibo {
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <=1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
