//Intersection of two Sorted Linked Lists
//Given two lists sorted in increasing order, create and return a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed. 

//Example: 

//Input: 
//First linked list: 1->2->3->4->6
//Second linked list be 2->4->6->8, 
//Output: 2->4->6.
//The elements 2, 4, 6 are common in 
//both the list so they appear in the 
//intersection list. 

//Input: 
//First linked list: 1->2->3->4->5
//;;Second linked list be 2->3->4, 
//Output: 2->3->4
//The elements 2, 3, 4 are common in 
//both the list so they appear in the 
//intersection list.
package loveDSA;

public class $10IntersectionOfTwo {

    // head nodes for pointing to 1st and 2nd linked lists
    static Node a = null, b = null;
   
    // dummy node for storing intersection
    static Node dummy = null;
   
    // tail node for keeping track of
  // last node so that it makes easy for insertion
    static Node tail = null;
     
    // class - Node
    static class Node {
        int data;
        Node next;
 
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
     
    // function for printing the list
    void printList(Node start) {
        Node p = start;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
     
    // inserting elements into list
    void push(int data) {
        Node temp = new Node(data);
        if(dummy == null) {
            dummy = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }
     
    // function for finding intersection and adding it to dummy list
    void sortedIntersect()
    {
       
        // pointers for iterating
        Node p = a,q = b;
        while(p != null  &&  q != null)
        {
            if(p.data == q.data)
            {
                // add to dummy list
                push(p.data);
                p = p.next;
                q = q.next;
            }
            else if(p.data < q.data)
                p = p.next;
            else
                q= q.next;
        }
    }
     
  // Driver code
    public static void main(String args[])
    {
    	$10IntersectionOfTwo  list = new $10IntersectionOfTwo ();
         
        // creating first linked list
        list.a = new Node(1);
        list.a.next = new Node(2);
        list.a.next.next = new Node(3);
        list.a.next.next.next = new Node(4);
        list.a.next.next.next.next = new Node(6);
 
        // creating second linked list
        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = new Node(6);
        list.b.next.next.next = new Node(8);
         
        // function call for intersection
        list.sortedIntersect();
       
        // print required intersection
        System.out.println("Linked list containing common items of a & b");
        list.printList(dummy);
    }
}
