package LinkedList.deletion;
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
{
    Node head;
    void traversal()
    {
        Node curr = head;
        while(curr!= null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Node temp = new Node(e);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node curr = head;
            while (curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next = temp;
        }


    }
    void addFirst(int e)
    {
        Node temp = new Node(e);
        if(head == null)
        {
            head = temp;
        }

        else
        {
            temp.next = head;
            head = temp;
        }


    }

    void addIndex(int e,int index)
    {
        Node temp = new Node(e);
        if(index==0)
        {
            head = temp;
        }

        else
        {
            Node curr = head;
            int count =0;
            while(count<index-1)
            {
                curr = curr.next;
                count++;
            }
            temp.next = curr.next;
            curr.next = temp;

        }


    }
    void deletelast()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
        }
        else if(head.next==null)
        {
            head =null;
        }
        else
        {
            Node curr = head;
            while(curr.next.next!=null)
            {
              curr = curr.next;
            }
            curr.next= null;
        }
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
        }
        else if(head.next==null)
        {
            head =null;
        }
        else
        {
            Node curr = head;
           head = head.next;
           curr.next = null;
        }
    }

}


public class Deletion_Element {
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(55);
        ll.add(66);
        ll.addFirst(1);
        ll.addIndex(100,3);
        System.out.println("after insertion");
        ll.traversal();
        ll.deletelast();
        System.out.println("after deletion last element");
        ll.traversal();
        ll.deleteFirst();
        System.out.println("after deletion first element");
        ll.traversal();

    }
}
