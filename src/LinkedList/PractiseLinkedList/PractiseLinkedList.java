package LinkedList.PractiseLinkedList;

class Node
{
    int data;
    Node next;
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
}
class LinkedList
{ Node head ;
   void traversal()
   {
       Node curr = head;
       while(curr!=null)
       {
           System.out.println(curr.data);
           curr= curr.next;
       }
   }
   void add(int data)
   {
       Node temp = new Node(data);

       if(head==null)
       {
           head = temp;
       }
       else {
           Node curr = head;
           while(curr.next!=null)
           {
               curr = curr.next;
           }
           curr.next = temp;
       }
   }
   void addFirstIndex(int data)
   {
       Node temp = new Node(data);
       if(head==null)
       {
           head = temp;
       }
       else {
           temp.next = head;
           head = temp;
       }
   }
}
public class PractiseLinkedList {
    public static void main(String args[])
    {
LinkedList ll = new LinkedList();
ll.add(4);
ll.add(5);
ll.addFirstIndex(3);
        ll.addFirstIndex(23);
        ll.addFirstIndex(33);
        ll.add(53);

ll.traversal();
    }
}
