// find numbers with even number of digits.
public class FindEvenDigit {
    public static void main(String[] args){
        int[] nums= { 545,32,5,8466,78535,88,6325,14563};
       int result=  FindNumber(nums);
       System.out.println("Count the numbers with even digit "+result);
    }
    static int FindNumber(int[] nums){
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigit= digit(num);
        if(numberOfDigit%2==0){
            return true;
        }
        return false;
    }
    
        static int digit(int num){
          int count = 0;
          while (num>0){
            count ++;
            num=num/10;
          }
          return count;
        
    }

}