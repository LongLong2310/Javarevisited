public class lengthLinkedList {

    public static void main(String[] args)
    {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        llist.add(1);
        llist.add(3);
        llist.add(1);
        llist.add(2);
        llist.add(1);

        System.out.println("Count of nodes is " +
                llist.getCount());
    }
}

// Java program to count number of nodes in a linked list

/* Linked list Node*/
class Node
{
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

// Linked List class
class LinkedList
{
    Node head; // head of list

    /* Inserts a new Node at front of the list. */
    public void add(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

}
