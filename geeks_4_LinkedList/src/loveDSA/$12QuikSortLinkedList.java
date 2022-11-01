//QuickSort on Singly Linked List
//Follow the given steps to solve the problem:

//Call partition function to get a pivot node placed at its correct position
//In the partition function, the last element is considered a pivot
//Then traverse the current list and if a node has a value greater than the pivot, then move it after the tail. If the node has a smaller value, then keep it at its current position. 
//Return pivot node
//Find the tail node of the list which is on the left side of the pivot and recur for the left list
//Similarly, after the left side, recur for the list on the right side of the pivot
//Now return the head of the linked list after joining the left and the right list, as the whole linked list is now sorted
		
		
package loveDSA;

public class $12QuikSortLinkedList {
	static class Node {
		 
        int data;
        Node next;
 
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
 
    Node head;
 
    void addNode(int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
 
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
 
        Node newNode = new Node(data);
        curr.next = newNode;
    }
 
    void printList(Node n)
    {
        while (n != null) {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;
        }
    }
 
    // Takes first and last node,
    // but do not break any links in
    // the whole linked list
    Node paritionLast(Node start, Node end)
    {
        if (start == end || start == null || end == null)
            return start;
 
        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;
 
        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.data < pivot) {
 
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
 
        // Swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;
 
        // Return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }
 
    void sort(Node start, Node end)
    {
        if (start == null || start == end
            || start == end.next)
            return;
 
        // Split list and partition recurse
        Node pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);
 
        // If pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null && pivot_prev == start)
            sort(pivot_prev.next, end);
 
        // If pivot is in between of the list,
        // start from next of pivot,
        // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null
                 && pivot_prev.next != null)
            sort(pivot_prev.next.next, end);
    }
 
    // Driver's Code
    public static void main(String[] args)
    {
    	$12QuikSortLinkedList  list
            = new $12QuikSortLinkedList ();
        list.addNode(30);
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(5);
 
        Node n = list.head;
        while (n.next != null)
            n = n.next;
 
        System.out.println("Linked List before sorting");
        list.printList(list.head);
 
        // Function call
        list.sort(list.head, n);
 
        System.out.println("\nLinked List after sorting");
        list.printList(list.head);
    }
}
