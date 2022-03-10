import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Stack<Integer>st=new Stack<Integer>();

        // push method add element in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

         // by using peek() we can find top element of stack
        st.peek(); // 50
        // size 
        System.out.println(st.size());
        // by using pop() function we can get top and delete it
        st.pop(); // 50
        System.out.println(st.size());

        System.out.println(st);// 10 20 30 40        

         // isEmpty method by using this we can check is Stack empty it will return boolean

        System.out.println(st.isEmpty());

         // capacity show the what is max size of stack
        System.out.println( st.capacity());
    }
}
