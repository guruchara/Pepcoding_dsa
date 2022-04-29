import java.util.PriorityQueue;
import java.util.Collections;
import javafx.scene.layout.Priority;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    // it is the example of Max heap 
    // in max heap all elements will print in decreasing order
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println(pq);
    }
}