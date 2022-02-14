import java.sql.Time;
import java.util.LinkedList;
public class allmethod {
     public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<Integer>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        l.add(80);

        // print all element of linkedList
        System.out.println(l);

        // add element first 
        l.addFirst(100);

        // print 
        System.out.println(l);

        // add in last
        l.addLast(200);

         // print
         System.out.println(l);

    
         // check given value present or not
        // contains method will return boolean value if value found then return true otherwise false
       boolean flag= l.contains(10);
       
         System.out.println(flag);

         // remove element from specifiec index
         l.remove(1);

         System.out.println(l);

         // get elemenet through given index

         System.out.println(l.get(3)); // 

         // set value on given index
        // below i put new value 155
         l.set(2,155);

         System.out.println(l);

         // find index of first occurance element. if not present then return -1
         
         System.out.println(l.indexOf(10));

         // index of last occurance elemenet.

         System.out.println(l.lastIndexOf(20));

         // above all methods take O(n) time whereas isEmpty method only O(1)  constant Time.class
     // isEmpty will return boolean value true or false. 
         System.out.println(l.isEmpty());

        // get first getlast all method generate Exception whereas except remaining all methods will return null
 

        System.out.println("If LinkedList is Empty then it will return null");
        // pollFirst method will delete first element from LinkedList similar as pop in stack
          int k=l.pollFirst();

          // polling element is k
          System.out.println("polling element is " +k);
          System.out.println(l);

      // pollLast method will delete last element from linkedList 
      int deletelement=l.pollLast();
      System.out.println("Last Polling element is " +deletelement);

      System.out.println(l);

      // peekFirst it wii return first element of linkedList but not delete .

      int peekelement=l.peekFirst();

      System.out.println(peekelement);

      System.out.println(l);

      //peekLast it will return Last Element of LinkedList but not delete

      int peeklastElement=l.peekLast();
      
      System.out.println(peeklastElement);
      System.out.println("You can observe here " +l);

     // offerFirst method use for inserting data the in 0 index 

     l.offerFirst(1000);

     System.out.println(l);

     // linkedList also start from 0 index
     // offerLast method use for inserting data in size-1 position.

     l.offerLast(2000);
    
      System.out.println(l);

      // size() will return size of linkedList
      System.out.println(l.size());

      
    }
}
