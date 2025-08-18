// wap to count how mny times n is occur
public class Counting_series{
    public static void main(String[] args){
        int n= 655415;
        int count =0;
        while(n>0){
            int rem =n%10;
            if(rem ==5){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number occurence of 5 is "+count);
    }
}