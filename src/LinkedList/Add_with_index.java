package LinkedList;
class Node5
{
    int data;
    Node5 next;
    Node5(int data)
    {
        this.data = data ;
        this.next= null;
    }
}

class LinkedL
{
    Node5 head;
    void traverse()
    {
        Node5 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void add(int e)
    {
        Node5 temp = new Node5(e);//node creation
        if(head == null)//if the empty list
        {

            head = temp;
        }
        else//for the not empty list
        {
            Node5 curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
    void addFirst(int e)
    {
         Node5 temp = new Node5(e);
         if(head==null)
         {
             head = temp;
         }
         else {
             temp.next = head;
             head = temp;
         }
    }
    void addIndex(int index,int element)
    {
        if(index ==0)
        {
            addFirst(element);
        }
        else
        {
            Node5 temp = new Node5(element);
            int count =0;
            Node5 curr = head;
            while(count<index-1)
            {
                curr = curr.next;
                count++;

            }
            temp.next = curr.next;
            curr.next = temp;
        }

    }
}


public class Add_with_index {
    public static void main(String args[])
    {
        LinkedL ll = new LinkedL();

        ll.add(5);
        ll.add(5);
        ll.add(85);
        ll.add(59);
        ll.add(577);

        ll.traverse();
        ll.addIndex(0,554);
        ll.traverse();
        ll.addIndex(3,55774);
        ll.traverse();




    }
}
