package LinkedList.Questions.Deletion;
class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linked {
    Node2 head;

    void traverse() {
        Node2 curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void add(int e) {
        Node2 temp = new Node2(e);//node creation
        if (head == null)//if the empty list
        {

            head = temp;
        } else//for the not empty list
        {
            Node2 curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
    Node2  deleteNth(int n)
    {
        if(head ==null ||head .next ==null)
        {
            return null;
        }
        Node2 fast = head;
        int i =1;
        while(i<=n)
        {
            fast = fast.next;
            i++;


        }

        if(fast ==null)//so it want to remove the head node
        {
            return head.next;
        }
        Node2 slow = head;
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;



    }
}

public class Deletion_Nth_Node_End {
    public static void main(String args[]) {
        Linked ll = new Linked();

        ll.add(5);
        ll.add(5);
        ll.add(85);
        ll.add(59);
        ll.add(577);
        int n = 2;

        ll.traverse();
      Node2 temp  = ll.deleteNth(n);
        System.out.println("after deltion");
      ll.traverse();




    }
}