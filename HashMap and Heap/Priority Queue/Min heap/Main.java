import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        // in java by default order of to printing the element is increasing order
        // we can say increasing means min heap 
        // example of min heap        
        System.out.println(pq);
    }
}