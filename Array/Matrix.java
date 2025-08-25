// creating a matrix
import java.util.Scanner;
import java.util.Arrays;
public class Matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr=new int[3][4];
        // print the lenght of row
        System.out.println(arr.length);
        //taking values of matrix 
           System.out.println("Enter the values of matrix");
        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=input.nextInt();
            }
        }
        // The matrix is 
        System.out.println("The matrix is given below");
        for(int row = 0; row<arr.length; row++){
            //for(int col=0; col<arr[row].length; col++){
               System.out.println("the matrix is "+Arrays.toString(arr[row])) ;
    }
}
    }

