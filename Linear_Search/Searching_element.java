public class Searching_element {
    public static void main(String[] args){
        int[] arr ={1,5,6,7,8,74,65,23};
        int target =65;
       int ans=  Search(arr, target);
       System.out.println("The ans is "+ans);

    }
    static int Search(int[] arr, int  target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0; i<arr.length; i++){
            int element =arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    
}
