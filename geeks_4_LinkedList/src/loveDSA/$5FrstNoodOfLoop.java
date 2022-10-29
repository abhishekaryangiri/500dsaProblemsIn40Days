//Find first node of loop in a linked list
//Write a function findFirstLoopNode() that checks whether a given Linked List contains a loop. If the loop is present then it returns point to the first node of the loop. Else it returns NULL.
//We have discussed Floyd’s loop detection algorithm. Below are steps to find the first node of the loop.
//1. If a loop is found, initialize a slow pointer to head, let fast pointer be at its position. 
//2. Move both slow and fast pointers one node at a time. 
//3. The point at which they meet is the start of the loop.
package loveDSA;

public class $5FrstNoodOfLoop {
	 
	static class Node
	{
	  int key;
	  Node next;
	};
	 
	static Node newNode(int key)
	{
	  Node temp = new Node();
	  temp.key = key;
	  temp.next = null;
	  return temp;
	}
	 
	// A utility function to
	// print a linked list
	static void printList(Node head)
	{
	  while (head != null)
	  {
	    System.out.print(head.key + " ");
	    head = head.next;
	  }
	  System.out.println();
	}
	 
	// Function to detect and remove loop
	// in a linked list that may contain loop
	static Node detectAndRemoveLoop(Node head)
	{
	  // If list is empty or has
	  // only one node without loop
	  if (head == null || head.next == null)
	    return null;
	 
	  Node slow = head, fast = head;
	 
	  // Move slow and fast 1
	  // and 2 steps ahead
	  // respectively.
	  slow = slow.next;
	  fast = fast.next.next;
	 
	  // Search for loop using
	  // slow and fast pointers
	  while (fast != null &&
	         fast.next != null)
	  {
	    if (slow == fast)
	      break;
	    slow = slow.next;
	    fast = fast.next.next;
	  }
	 
	  // If loop does not exist
	  if (slow != fast)
	    return null;
	 
	  // If loop exists. Start slow from
	  // head and fast from meeting point.
	  slow = head;
	  while (slow != fast)
	  {
	    slow = slow.next;
	    fast = fast.next;
	  }
	 
	  return slow;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	  Node head = newNode(50);
	  head.next = newNode(20);
	  head.next.next = newNode(15);
	  head.next.next.next = newNode(4);
	  head.next.next.next.next = newNode(10);
	 
	  // Create a loop for testing
	  head.next.next.next.next.next = head.next.next;
	 
	  Node res = detectAndRemoveLoop(head);
	  if (res == null)
	    System.out.print("Loop does not exist");
	  else
	    System.out.print("Loop starting node is " +  res.key);
	}
}
