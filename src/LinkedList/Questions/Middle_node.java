package LinkedList.Questions;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node1 head;

    void traversal() {
        Node1 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void add(int e) {
        Node1 temp = new Node1(e);
        if (head == null) {
            head = temp;
        } else {
            Node1 curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    Node1 mid() {
        Node1 fast = head;
        Node1 slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    boolean palindrom ()
    {
        if(head==null || head.next ==null)
        {
            return true;
        }
        //find the mid node
        Node1 mid = mid();

        //reverse the 2nd half from mid
        Node1 curr = mid;
        Node1 prev = null;
        Node1 next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node1 right = prev;
        Node1 left = head;

//check left half and right half
        while(right!= null)
        {
            if(right.data != left.data)
            {
                return  false;
            }
            else
            {
                right = right.next;
                left = left.next;
            }

        }
        return true;

    }

}

public class Middle_node {
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.add(5);
        ll.add(57);
        ll.add(57);
        ll.add(5);
//        ll.traversal();
//        Node1 temp = ll.mid();
        System.out.println( ll.palindrom());
        ll.traversal();


    }
}
