/*
 Write a Java program to remove duplicates from a sorted linked list.
Original List with duplicate elements:
12->12->13->14->15->15->16->17->17
After removing duplicates from the said list:
12->13->14->15->16->17
 */
package dsaSenapati;

public class Basic123RemoveDublicate {
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void remove_Duplicates()
	{
		Node current = head;
     	Node next_next;
		if (head == null) 
			return;
		while (current.next != null) {
     		if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			}
			else 
			current = current.next;
		}
	}					

	// In front of the list insert a new Node
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data);
			if (temp.next != null)
			{
			System.out.print("->");
			}
			temp = temp.next;
		} 
	  System.out.println();
	}

   /* Driver program to test above functions */
	public static void main(String args[])
	{
		Basic123RemoveDublicate l_list = new Basic123RemoveDublicate();
		// Insert data into LinkedList
		l_list.push(17);
		l_list.push(17);
		l_list.push(16);
		l_list.push(15);
		l_list.push(15);
		l_list.push(14);
		l_list.push(13);
		l_list.push(12);
		l_list.push(12);
		
		System.out.println("Original List with duplicate elements:");
		l_list.printList();
		l_list.remove_Duplicates();
		
		System.out.println("After removing duplicates from the said list:");
		l_list.printList();
	}
}
