import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the any value");
        int n = input.nextInt();
        System.out.println(armstrong(n));

    }

    static boolean armstrong(int n) {
        int sum = 0;
        int num = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return num == sum;

    }
}