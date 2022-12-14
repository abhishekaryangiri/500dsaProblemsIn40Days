//Function to check if a singly linked list is palindrome
//Input: R->A->D->A->R->NULL
//Output: Yes

//Input: C->O->D->E->NULL
//Output: No

package loveDSA;
import java.io.*;
import java.util.*;
public class $16CheckLLpalindrom {

    int data;
    Node prev, next;
    Node(int val)
    {
        data = val; 
        prev = null;
        next = null;
    }
}
  
class GFG 
{
  
    // function to count triplets in 
    // a sorted doubly linked list 
    // whose sum is equal to a given value 'x' 
    static int countTriplets(Node head, int x)
    {
            Node ptr1, ptr2, ptr3;
            int count = 0;
  
            // generate all possible triplets 
            for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next)
                for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next)
                    for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next)
  
                        // if elements in the current triplet sum up to 'x' 
                        if ((ptr1.data + ptr2.data + ptr3.data) == x)
                              
                            // increment count
                            count++;
  
            // required count of triplets 
            return count;
    }
  
    // A utility function to insert a new node at the 
    // beginning of doubly linked list
    static Node insert(Node head, int val)
    {
            // allocate node 
            Node temp = new Node(val);
  
            if (head == null)
                head = temp;
  
            else 
            {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
          
            return head;
    }
  
    // Driver code
    public static void main(String args[])
    {
            // start with an empty doubly linked list
            Node head = null;
              
            // insert values in sorted order
            head = insert(head, 9);
            head = insert(head, 8);
            head = insert(head, 6);
            head = insert(head, 5);
            head = insert(head, 4);
            head = insert(head, 2);
            head = insert(head, 1);
  
            int x = 17;
            System.out.println("count = " + countTriplets(head, x));
    }
}