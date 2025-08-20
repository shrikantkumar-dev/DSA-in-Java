// simple calcalutor
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("enter the operator ");
        char ch= input.next().trim().charAt(0); 
        if(ch=='+'){
            int c=a+b;
            System.out.println("The sum is "+c);

        }
         if(ch=='-'){
            int c=a/b;
            System.out.println("The substraction is "+c);

        }
         if(ch=='/'){
            int c=a/b;
            System.out.println("The divison is "+c);

        }
         if(ch=='%'){
            int c=a%b;
            System.out.println("The remainder  is "+c);

        }
         if(ch=='*'){
            int c=a*b;
            System.out.println("The multiply is "+c);

        }
        
        }

    }
    

