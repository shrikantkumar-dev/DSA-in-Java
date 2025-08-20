import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the name of fruits");
    String fruit=input.next();
    switch(fruit){
        case "Mango":
        System.out.println("King of fruits");
        break;
        case "Apple":
        System.out.println("The red fruit");
        break;
        case "graphes":
        System.out.println("The small fruit");
        break;
        default:
        System.out.println("Enter the valid value");
        break;
    }
    }
    
}
