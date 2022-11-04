//Merge K Sorted Linked Lists using Min Heap
//Given K linked lists each of size N and each list is sorted in non-decreasing order, merge them into a single sorted (non-decreasing order) linked list and print the sorted linked list as output.

//Examples:

//Input: K = 3, N =  4
//list1 = 1->3->5->7->NULL
//list2 = 2->4->6->8->NULL
//list3 = 0->9->10->11->NULL

//Output: 0->1->2->3->4->5->6->7->8->9->10->11
//Merged lists in a sorted order where every element is greater than the previous element.
package loveDSA;

import java.util.PriorityQueue;

public class $26MergeKSorted {
	int data;
    Node next;
 
    Node(int key)
    {
        data = key;
        next = null;
    }
}
 
// Class implements Comparator to compare Node data
class NodeComparator implements Comparator<Node> {
 
    public int compare(Node k1, Node k2)
    {
        if (k1.data > k2.data)
            return 1;
        else if (k1.data < k2.data)
            return -1;
        return 0;
    }
}
class GFG {
    // Function to merge k sorted linked lists
    static Node mergeKList(Node[] arr, int K)
    {
        // Priority_queue 'queue' implemented
        // as min heap with the help of
        // 'compare' function
        PriorityQueue<Node> queue
            = new PriorityQueue<>(new NodeComparator());
        Node at[] = new Node[K];
        Node head = new Node(0);
        Node last = head;
        // Push the head nodes of all
        // the k lists in 'queue'
        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                queue.add(arr[i]);
            }
        }
        // Handles the case when k = 0
        // or lists have no elements in them
        if (queue.isEmpty())
            return null;
        // Loop till 'queue' is not empty
        while (!queue.isEmpty()) {
            // Get the top element of 'queue'
            Node curr = queue.poll();
 
            // Add the top element of 'queue'
            // to the resultant merged list
            last.next = curr;
            last = last.next;
            // Check if there is a node
            // next to the 'top' node
            // in the list of which 'top'
            // node is a member
            if (curr.next != null) {
                // Push the next node of top node
                // in 'queue'
                queue.add(curr.next);
            }
        }
        // Address of head node of the required
        // merged list
        return head.next;
    }
    // Print linked list
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args)
    {
        int N = 3;
       
        // array to store head of linkedlist
        Node[] a = new Node[N];
       
        // Linkedlist1
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
          head1.next.next.next = new Node(7);
       
        // Limkedlist2
        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
          head2.next.next = new Node(6);
          head2.next.next.next = new Node(8);
       
        // Linkedlist3
        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
          head3.next.next = new Node(10);
          head3.next.next.next = new Node(11);
 
        Node res = mergeKList(a, N);
 
        if (res != null)
            printList(res);
        System.out.println();
    }
}
