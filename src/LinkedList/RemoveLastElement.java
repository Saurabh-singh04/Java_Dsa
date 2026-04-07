package LinkedList;
class Nod
{
    int data;
    Nod next;
    Nod(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedLL
{
    Nod head;
    void traverse()
    {
        Nod curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Nod temp = new Nod(e);//node creation
        if(head == null)//if the empty list
        {

            head = temp;
        }
        else//for the not empty list
        {
            Nod curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
    void remove()
    {
        if(head==null)//0 node
        {
            System.out.println("list is empty");
        }
        else if(head.next ==null)//1 node
        {
            head = null;
        }
        else {
            Nod curr = head;


            while(curr.next.next !=null)
            {
                curr = curr.next;

            }

            curr.next = null;
        }
    }
    void removeFirst()
    {
        if(head ==null)
        {
            System.out.println("List is empty");
        }
        else if (head.next==null) {

            head = null;


        }
        else
        {
            Nod curr = head;
            head = head .next;
            curr.next = null;
        }
    }
    void removeIndex(int i) {
        if (i == 0) {
            removeFirst();
        }
        else
        {
            Nod curr = head;
            int count = 0;
            while (count < i - 1 && curr != null) {
                curr = curr.next;
                count++;
            }
            if (curr != null && curr.next != null) {
                curr.next = curr.next.next;
            }
        }
    }

}


public class RemoveLastElement {
    public static void main(String args[])
    {
        LinkedLL ll = new LinkedLL();

        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
//        ll.add(577);
//        ll.removeFirst();
//        ll.removeFirst();
//        ll.removeFirst();
//        ll.removeFirst();
//        ll.removeFirst();
//
//
//
//
//
//        ll.removeFirst();

        ll.traverse();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//
//
//        ll.remove();
//
//        ll.traverse();
        int index = 1;
        ll.removeIndex(index);



        ll.traverse();



    }
}
