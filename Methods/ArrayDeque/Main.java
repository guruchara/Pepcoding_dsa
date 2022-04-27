import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args)
	{
          ArrayDeque<Integer>dq=new ArrayDeque<>();

          dq.add(10);
          dq.add(20);
          dq.add(30);
          dq.add(40);
          dq.add(50);

          System.out.println(dq);

          // addFirst
          dq.addFirst(100);
          // after adding the element in first place
          System.out.println(dq);


          // add Elemenet in last
          dq.addLast(200);
          // after adding element in last 
          System.out.println(dq);

          // getting last element 
          System.out.println("getlast element : " +dq.getLast());

           // getting first element
          System.out.println("get first element : "+dq.getFirst());

           // clone of deque
           Deque<Integer>cloneq=dq.clone();
           System.out.println("Cloning Deque : " +cloneq);

           // try to check given element is present or not
           System.out.println("is Element present : " +dq.contains(10)); // yes i know 10 is present 

           // check given deque is isempty or not  it will return true or false
           System.out.println("is Dq isEmpty : "+dq.isEmpty());

           // add element in first by using offerFirst()
           dq.offerFirst(1000);
           System.out.println("After adding element in first : "+dq);

           // adding the element in last of deque  by offerLast
           dq.offerLast(2000);
           System.out.println("After adding element in last : "+dq);

           // delete element by using pop it will delete and return poll
           System.out.println("Deleting element is : "+dq.poll());

           System.out.println("After deleting the element Deque: "+dq);

           // peek it will return only peek element or first element of Deque 
           // it will not delte any element 
           System.out.println("Peek Element is : "+dq.peek());

           //  before removing the element 
           System.out.println("before removing the elements : "+dq);
           
           // remove  by remove method delete first element of deque
           dq.remove();

           System.out.println("after removing the element : "+dq);
	}
}