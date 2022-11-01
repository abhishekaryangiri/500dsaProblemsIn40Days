//Check if a linked list is Circular Linked List
//A linked list is called circular if it is not NULL-terminated and all nodes are connected in the form of a cycle. Below is an example of a circular linked list.
//Follow the given steps to solve the problem:

//Declare a Node pointer node and initialize it to the head’s next
//Move node pointer to the next node, while the node is not equal to nullptr and node is not equal to the head
//After coming out of the loop, check if the node is equal to head then return true, else return false
//Below is the Implementation of the above approach:
package loveDSA;

public class $14CircularLinkedList {
	 /* Link list Node */
    static class Node {
        int data;
        Node next;
    }
 
    /*This function returns true if given linked
    list is circular, else false. */
    static boolean isCircular(Node head)
    {
        // An empty linked list is circular
        if (head == null)
            return true;
 
        // Next of head
        Node node = head.next;
 
        // This loop would stop in both cases (1) If
        // Circular (2) Not circular
        while (node != null && node != head)
            node = node.next;
 
        // If loop stopped because of circular
        // condition
        return (node == head);
    }
 
    // Utility function to create a new node.
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
 
    /* Driver code*/
    public static void main(String args[])
    {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
 
        System.out.print(isCircular(head) ? "Yes\n"
                                          : "No\n");
 
        // Making linked list circular
        head.next.next.next.next = head;
 
        System.out.print(isCircular(head) ? "Yes\n"
                                          : "No\n");
    }
}
