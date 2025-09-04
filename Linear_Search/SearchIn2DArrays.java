// to find an element from the 2-D arrays.
import java.util.Arrays;
public class SearchIn2DArrays {
    public static void main(String[] args){
        int[][] arr ={
            {1,2,3,},
            {4,5,6,8},
            {7,9,11,22,33,55}
        };
        int target =22;
        System.out.println(Arrays.toString(Search(arr, target)));
    }
    static int[] Search(int[][] arr, int target){
        for(int row =0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {1,-1};
    }
    
}
