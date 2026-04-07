package LinkedList.Insertion;
class Node1
{
    int data;
    Node1 next;
    Node1(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList1
{
    Node1 head;
    void traversal()
    {
        Node1 curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");

            curr= curr.next;
        }
        System.out.print("null");

    }
    void addFirst(int data)
    { Node1 temp = new Node1(data);
        if(head==null)
        { head = temp;

        }
        else {
            temp.next = head;
            head = temp;
        }
    }
    void addLast(int data)
    {
        Node1 temp = new Node1(data);
        if(head == null)
        {
            head = temp;
        }
        Node1 curr = head;
        while(curr.next!=null)

        {
            curr= curr.next;
        }
        curr.next = temp;

    }
    void addAtIndex(int index,int data)
    {
        Node1 temp = new Node1(data);
        int count =0;
        Node1 curr = head;
        if(index==0)
        {
            addFirst(data);
        }
        else {


        while(count<index-1)
        {
            curr = curr.next;
            count++;
        }
        temp.next = curr.next;
        curr.next = temp;



    }}
    void deleteFirst()
    {
        if(head.next ==null)
        {
            head =null;
        }
        else
        {
            Node1 curr = head;
            head = head.next;
            curr.next = null;
        }
    }
    void deleteLast()
    {
        if(head.next==null)
        {
            head = null;
        }
        else {
            Node1 curr = head;
            while(curr.next.next !=null)
            {
                curr = curr.next;
            }
            curr.next = null;

        }
    }
}
public class PractiseLinkedList {


    public static void main(String args[])
    {
LinkedList1 l = new LinkedList1();
l.addFirst(19);
        l.addFirst(29);
        l.addFirst(39);
        l.addFirst(49);
        l.addFirst(59);
        l.addLast(44);
        l.addAtIndex(4,55);
        l.deleteFirst();
        l.deleteLast();


l.traversal();

    }
}
