// adding the new elemet and removing from the array list

//import java.lang.classfile.Signature.ArrayTypeSig;
import java.util.ArrayList;
import java.util.Arrays;
public class List_Example {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>(10);
        List.add(67);
        List.add(68);
        List.add(69);
        List.add(70);
        List.add(78);
        List.add(50);
        System.out.println(List);

        List.set(1,80); // it change the number from the index 1 
        System.out.println(List);
        List.remove(2);          // It remove the number from the index number 2
         System.out.println(List);
    }
    
}
