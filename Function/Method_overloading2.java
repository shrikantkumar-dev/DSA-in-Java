// Another example of Method overloading

public class Method_overloading2 {
    public static void main(String[] args){
        fun(21);
        fun("Shrikant");
    }
    static void fun(int a){
    System.out.println("The age is "+a);
    }
    static void fun(String name){
        System.out.println("The name is "+name);
    }
}