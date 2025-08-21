// Print arsmstrong number upto n;

import java.util.Scanner;
public class Print_armstrong {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
         System.out.println("Enter the value of n");
        for(int i=1; i<=n; i++){
        if(Isarmstrong(i)){
        System.out.println(i);
        }
    }
}
    static boolean Isarmstrong(int n){
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