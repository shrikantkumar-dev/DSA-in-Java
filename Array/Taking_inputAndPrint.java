import java.util.Scanner;
public class Taking_inputAndPrint{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] arr=new int[6];
        arr[0]=5;
        arr[1]=10;
        arr[2]=9;
        arr[3]=4;
        arr[4]=1;
        arr[5]=15;
        System.out.println(arr[3]);
        // Taking input 
        System.out.println("Enter numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        // Now print the output from which input are taken
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
    }

}
}