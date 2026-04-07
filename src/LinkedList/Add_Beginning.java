package LinkedList;

class Node3
{
    int data;
    Node3 next;
    Node3(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linked1
{
    Node3 head;
    void traverse()
    {
        Node3 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Node3 temp = new Node3(e);//node creation
        if(head == null)//if the empty list
        {

            head = temp;
        }
        else//for the not empty list
        {
            Node3 curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
    void addBeginning(int e)
    {
        Node3 temp2 = new Node3(e);
        if(head==null)
        {
            head = temp2;
        }
        else
        {
            temp2.next = head;
            head = temp2;
        }
    }
}
public class Add_Beginning {
    public static void main(String args[])
    {
        Linked1 ll = new Linked1();

        ll.add(5);
        ll.add(5);
        ll.add(85);
        ll.add(59);
        ll.add(577);

        ll.addBeginning(1);

        ll.traverse();



    }
}
