public class Swapping{
    public static void swap(int a , int b){
         int temp = a;
                a= b;
               b= temp;
               System.out.println("After swapping a="+a +"and b= "+b);

    }
     public  static void main(String[] args){
       int a =5;
       int b= 6;
    System.out.println("Before swapping a="+a +"and b= "+b);
     swap(a,b);
     
    }
}