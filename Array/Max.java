public class Max {
    public static void main(String[] args){
        int[] arr={5,6,8,6,3,54,89,92,63};
        int max=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                System.out.print("The max number is"+max);
            }
        }
    }
    
}
