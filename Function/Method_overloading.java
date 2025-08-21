/* Method overloading - In which there is same name of function and share same work but have different parameters */

// Sum of two or three number using function by the user choice

import java.util.Scanner;

public class Method_overloading {
    public static void main(String[] args) {
        System.out.println("Enter the choice ");
        Scanner input = new Scanner(System.in);
        int choice =input.nextInt();

        if(choice==2){
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = sum(a,b);
        System.out.println("The sum of two nmber is"+ans);
        }
        else if(choice==3){
            int a = input.nextInt();
             int b = input.nextInt();
            int c = input.nextInt();
            int ans = sum(a, b,c);
             System.out.println("The sum of three number is "+ans);
    }
    else
     {
        System.out.println("Enter the valid choice");
    }
}

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

