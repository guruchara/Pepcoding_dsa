import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        int a[]={10,20,30};
           
        ArrayList<Integer>l=new ArrayList<>();

         // in addAll method only we can add the elements array 
       Collections.addAll(l,10,20,49);

       System.out.println(l);

    }
}