// This is the leetcode question where we want to find which peson have more wealth in the Given 2D arrays.

public class MaxWealth {
    public static void main(String[] args){
        int[][] arr ={
            {1,2,5},
            {4,5,1}
        };
        int result =MaximumWealth(arr);
        System.out.println("The maximum wealth is"+result);
    }
    static int MaximumWealth(int[][] arr){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int person =0; person<arr.length; person++){
            for(int account= 0;account<arr[person].length; account++) {
                sum= sum +arr[person][account];
            }
            if(sum>ans){
                ans= sum;
            }
        }
        return ans;
    }
    
}
