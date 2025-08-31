public class Search_range {
    public static void main(String[] args){
        int[] arr={5,3,58,6,7,32,64,84,62,63,24,66};
        int target =64;
         System.out.println(Search(arr, target, 2,10));
    }
    static int Search(int[] arr, int target, int start , int end){
        if(arr.length==0){
            return -1;
        }
        for(int index= start; index<end ; index++ ){
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }

    
}
