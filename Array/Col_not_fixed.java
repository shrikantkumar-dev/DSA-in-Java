// creating a matrix in which the column are not fixed or not equal
import java.util.Arrays;
public class Col_not_fixed {
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        for(int row =0; row<arr.length; row++){
            //for(int col =0; col<arr[row].length; col++){
                System.out.println(Arrays.toString(arr[row]));
            }
         //System.out.println()   ;
        }
    }

