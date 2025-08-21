// to check the given number is prime or not ?
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
         Isprime(n);
       
    }
    static void Isprime(int n){
        if(n<1){
            System.out.println("The given number is negative number");
        }
        boolean Isprime = true;
        for(int i=2 ; i<=n/2; i++){
            if(n%i==0){
                 Isprime = false;
            }
        }
               if(Isprime){

                System.out.println("The given number  a prime number");
            
            }
            else{
                System.out.println("The given number is not a prime number");
                
            }
        }

    }