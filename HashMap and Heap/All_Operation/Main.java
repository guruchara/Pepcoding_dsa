import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
     
        hm.put(1,1);
        hm.put(2,1);
        hm.put(3,2);
        hm.put(4,1);
        hm.put(2,3);
        hm.put(8,1);
        hm.put(5,1);

        System.out.println(hm);
    }
}