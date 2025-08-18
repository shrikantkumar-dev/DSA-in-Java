import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("The fibonacii series is " +a+"" );
            int temp = b;
            b = a + b;
            a = temp;
        }
        
    }

}
