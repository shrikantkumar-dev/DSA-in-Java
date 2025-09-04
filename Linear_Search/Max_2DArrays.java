//Finding the maximum number inside the 2D Arrays.
public class Max_2DArrays {
    public static void main(String[] args){
        int[][] arr ={
            {1,2,3,4},
            { 12,45,63,11 },
            {78,64,14,65}
        };
        System.out.println(Search(arr));
    }
    static int Search(int[][] arr){
    int max=arr[0][0];
       for(int row =0; row<arr.length; row++){
        for(int col=0; col<arr[row].length; col++){
            if(arr[row][col]>max){
                max=arr[row][col];
            }
        }  
    }
       return max;
}
    }
    