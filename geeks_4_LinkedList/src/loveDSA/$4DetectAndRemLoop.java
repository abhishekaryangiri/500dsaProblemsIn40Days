//Detect and Remove Loop in a Linked List
//Write a function detectAndRemoveLoop() that checks whether a given Linked List contains a loop and if the loop is present then removes the loop and returns true. If the list doesn’t contain a loop then it returns false. The below diagram shows a linked list with a loop. detectAndRemoveLoop() must change the below list to 1->2->3->4->5->NULL.
//Method 1 (Check one by one) We know that Floyd’s Cycle detection algorithm terminates when fast and slow pointers meet at a common point. We also know that this common point is one of the loop nodes (2 or 3 or 4 or 5 in the above diagram). Store the address of this in a pointer variable say ptr2. After that start from the head of the Linked List and check for nodes one by one if they are reachable from ptr2. Whenever we find a node that is reachable, we know that this node is the starting node of the loop in the Linked List and we can get the pointer to the previous of this node.

//Output:

//Linked List after removing loop 
//50 20 15 4 10 
package loveDSA;

public class $4DetectAndRemLoop {
	 static Node head;
	  
	    static class Node {
	  
	        int data;
	        Node next;
	  
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	  
	    // Function that detects loop in the list
	    int detectAndRemoveLoop(Node node)
	    {
	        Node slow = node, fast = node;
	        while (slow != null && fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	  
	            // If slow and fast meet at same point then loop is present
	            if (slow == fast) {
	                removeLoop(slow, node);
	                return 1;
	            }
	        }
	        return 0;
	    }
	  
	    // Function to remove loop
	    void removeLoop(Node loop, Node head)
	    {
	        Node ptr1 = loop;
	        Node ptr2 = loop;
	  
	        // Count the number of nodes in loop
	        int k = 1, i;
	        while (ptr1.next != ptr2) {
	            ptr1 = ptr1.next;
	            k++;
	        }
	  
	        // Fix one pointer to head
	        ptr1 = head;
	  
	        // And the other pointer to k nodes after head
	        ptr2 = head;
	        for (i = 0; i < k; i++) {
	            ptr2 = ptr2.next;
	        }
	  
	        /*  Move both pointers at the same pace,
	         they will meet at loop starting node */
	        while (ptr2 != ptr1) {
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }
	  
	        // Get pointer to the last node
	        while (ptr2.next != ptr1) {
	            ptr2 = ptr2.next;
	        }
	  
	        /* Set the next node of the loop ending node
	         to fix the loop */
	        ptr2.next = null;
	    }
	  
	    // Function to print the linked list
	    void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	  
	    // Driver program to test above functions
	    public static void main(String[] args)
	    {
	    	$4DetectAndRemLoop list = new $4DetectAndRemLoop();
	        list.head = new Node(50);
	        list.head.next = new Node(20);
	        list.head.next.next = new Node(15);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(10);
	  
	        // Creating a loop for testing
	        head.next.next.next.next.next = head.next.next;
	        list.detectAndRemoveLoop(head);
	        System.out.println("Linked List after removing loop : ");
	        list.printList(head);
	    }
}
