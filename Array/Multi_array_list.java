// printing the multiple array(list of list) list taking by number;
import java.util.Scanner;
import java.util.ArrayList;
public class Multi_array_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>List=new ArrayList<>();
      
        // below making three empty array inside a array. or you can say three empty list inside the row
        for(int i=0; i<3; i++){     
            List.add(new ArrayList<>());
        }
        for(int i=0; i<3;i++){      // it goes through each row 
            for(int j=0; j<3; j++){     // it fills each  row with three integer
                List.get(i).add(input.nextInt());
            }
        }
        System.out.println(List);
    }
    
}
