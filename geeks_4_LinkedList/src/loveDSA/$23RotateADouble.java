//Reverse a doubly linked list in groups of given size
//Approach: Create a recursive function say reverse(head, k). This function receives the head or the first node of each group of k nodes. It reverses those groups of k nodes by applying the approach discussed in Reverse a doubly linked list | Set-2. After reversing the group of k nodes the function checks whether next group of nodes exists in the list or not. If a group exists then it makes a recursive call to itself with the first node of the next group and makes the necessary adjustments with the next and previous links of that group. Finally, it returns the new head node of the reversed group. 

package loveDSA;

public class $23RotateADouble {
	   int data;
	    Node next, prev;
	}
	 
	class GFG
	{
	 
	    // function to get a new node
	    static Node getNode(int data)
	    {
	        // allocating node
	        Node new_node = new Node();
	        new_node.data = data;
	        new_node.next = new_node.prev = null;
	 
	        return new_node;
	    }
	 
	    // function to insert a node at the beginning
	    // of the Doubly Linked List
	    static Node push(Node head, Node new_node)
	    {
	        // since we are adding at the beginning,
	        // prev is always NULL
	        new_node.prev = null;
	 
	        // link the old list off the new node
	        new_node.next = head;
	 
	        // change prev of head node to new node
	        if (head != null)
	            head.prev = new_node;
	 
	        // move the head to point to the new node
	        head = new_node;
	        return head;
	    }
	 
	    // function to reverse a doubly linked list
	    // in groups of given size
	    static Node revListInGroupOfGivenSize(Node head, int k)
	    {
	        Node current = head;
	        Node next = null;
	        Node newHead = null;
	        int count = 0;
	 
	        // reversing the current group of k
	        // or less than k nodes by adding
	        // them at the beginning of list
	        // 'newHead'
	        while (current != null && count < k)
	        {
	            next = current.next;
	            newHead = push(newHead, current);
	            current = next;
	            count++;
	        }
	 
	        // if next group exists then making the desired
	        // adjustments in the link
	        if (next != null)
	        {
	            head.next = revListInGroupOfGivenSize(next, k);
	            head.next.prev = head;
	        }
	 
	        // pointer to the new head of the
	        // reversed group
	        return newHead;
	    }
	 
	    // Function to print nodes in a
	    // given doubly linked list
	    static void printList(Node head)
	    {
	        while (head != null)
	        {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	        // Start with the empty list
	        Node head = null;
	             
	        // Create doubly linked: 10<->8<->4<->2
	        head = push(head, getNode(2));
	        head = push(head, getNode(4));
	        head = push(head, getNode(8));
	        head = push(head, getNode(10));
	 
	        int k = 2;
	             
	        System.out.print("Original list: ");
	        printList(head);
	 
	        // Reverse doubly linked list in groups of
	        // size 'k'
	        head = revListInGroupOfGivenSize(head, k);
	 
	        System.out.print("\nModified list: ");
	        printList(head);
	    }
}
