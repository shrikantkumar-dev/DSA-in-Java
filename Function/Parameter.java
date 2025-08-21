// example of using parameter in function
import java.util.Scanner;
public class Parameter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of string");
        String name = input.next();
        String person = greet(name);
        System.out.println(person);
    }
    static String greet(String name){
        String message = "Hello" +" "+ name;
        return message;

    }
}