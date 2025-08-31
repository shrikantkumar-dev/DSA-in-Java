//Search a minimum number from the given number.
public class Min_no_array {
    public static void main(String[] args){
      int[] arr = {5,3,6,7,9,1,55,44,66,33};
      System.out.println(Minimum(arr));
    }
    static int Minimum(int[] arr){
        int ans= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<ans){
                ans= arr[i];
            }
        }
        return ans;
    }
}
