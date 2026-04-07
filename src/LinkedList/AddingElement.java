package LinkedList;

class Node2
{
    int data;
    Node2 next;
    Node2(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linked
{
    Node2 head;
    void traverse()
    {
        Node2 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Node2 temp = new Node2(e);//node creation
        if(head == null)//if the empty list
        {

            head = temp;
        }
        else//for the not empty list
        {
            Node2 curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
}
public class AddingElement {
    public static void main(String args[])
    {
        Linked ll = new Linked();

        ll.add(5);
        ll.add(5);
        ll.add(85);
        ll.add(59);
        ll.add(577);

        ll.traverse();



    }
}
