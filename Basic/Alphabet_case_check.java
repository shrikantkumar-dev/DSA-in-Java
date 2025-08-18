// to check the given word is in upper case or not.
import java.util.Scanner;
public class Alphabet_case_check {
    public static void main(String[] args){
        System.out.println("enter the word");
        Scanner input = new Scanner(System.in);
         char ch =input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }
    }
    
}
