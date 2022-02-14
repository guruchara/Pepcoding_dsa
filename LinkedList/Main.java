public class Main {
    public static class Node {
        int val;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;

        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.val = val;

            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public  void display()
        {
             Node temp=head;
             while(temp!=null)
             {
                 System.out.print(temp.val+" ");
                 temp=temp.next;
             }
             System.out.println();
        }

        
    }
}