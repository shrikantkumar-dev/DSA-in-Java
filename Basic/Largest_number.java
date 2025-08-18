import java.util.Scanner;
public class Largest_number {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        //int max=num1;
        // if(num2>max){
        //     max=num2;
        // }
        // if(num3>max){
        //     max=num3;
        // }
        // this is short formula to find largest number among three numbers.
        int max=Math.max(num1,Math.max(num2, num3));

        System.out.println("The largest number among three number is "+max);
        
    }
    
}
