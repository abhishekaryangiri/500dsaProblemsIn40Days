//Delete nodes which have a greater value on right side
//Given a singly linked list, remove all the nodes which have a greater value on the right side. 
/*
Examples: 
a) The list 12->15->10->11->5->6->2->3->NULL should be changed to 15->11->6->3->NULL. Note that 12, 10, 5 and 2 have been deleted because there is a greater value on the right side. 
When we examine 12, we see that after 12 there is one node with a value greater than 12 (i.e. 15), so we delete 12. 
When we examine 15, we find no node after 15 that has a value greater than 15, so we keep this node. 
When we go like this, we get 15->6->3
b) The list 10->20->30->40->50->60->NULL should be changed to 60->NULL. Note that 10, 20, 30, 40, and 50 have been deleted because they all have a greater value on the right side.
c) The list 60->50->40->30->20->10->NULL should not be changed. 
*/
package loveDSA;

public class $28DelNodeWhichHave {
	 Node head; // head of list
	  
	    /* Linked list Node*/
	    class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	  
	    /* Deletes nodes which have a node with greater
	       value node on left side */
	    void delLesserNodes()
	    {
	        /* 1.Reverse the linked list */
	        reverseList();
	  
	        /* 2) In the reversed list, delete nodes which
	           have a node with greater value node on left
	           side. Note that head node is never deleted
	           because it is the leftmost node.*/
	        _delLesserNodes();
	  
	        /* 3) Reverse the linked list again to retain
	           the original order */
	        reverseList();
	    }
	  
	    /* Deletes nodes which have greater value node(s)
	       on left side */
	    void _delLesserNodes()
	    {
	        Node current = head;
	  
	        /* Initialise max */
	        Node maxnode = head;
	        Node temp;
	  
	        while (current != null && current.next != null) {
	            /* If current is smaller than max, then delete
	               current */
	            if (current.next.data < maxnode.data) {
	                temp = current.next;
	                current.next = temp.next;
	                temp = null;
	            }
	  
	            /* If current is greater than max, then update
	               max and move current */
	            else {
	                current = current.next;
	                maxnode = current;
	            }
	        }
	    }
	  
	    /* Utility functions */
	  
	    /* Inserts a new Node at front of the list. */
	    void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	  
	    /* Function to reverse the linked list */
	    void reverseList()
	    {
	        Node current = head;
	        Node prev = null;
	        Node next;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
	  
	    /* Function to print linked list */
	    void printList()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	  
	    /* Driver program to test above functions */
	    public static void main(String args[])
	    {
	    	$28DelNodeWhichHave llist = new $28DelNodeWhichHave();
	  
	        /* Constructed Linked List is 12->15->10->11->
	           5->6->2->3 */
	        llist.push(3);
	        llist.push(2);
	        llist.push(6);
	        llist.push(5);
	        llist.push(11);
	        llist.push(10);
	        llist.push(15);
	        llist.push(12);
	  
	        System.out.println("Given Linked List");
	        llist.printList();
	  
	        llist.delLesserNodes();
	  
	        System.out.println("Modified Linked List");
	        llist.printList();
	    }
}
