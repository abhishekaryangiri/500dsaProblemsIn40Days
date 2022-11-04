//Clone a Linked List with next and Random Pointer
//An example of linked list with a random pointerGiven a linked list of size N where each node has two links: one pointer points to the next node and the second pointer points to any node in the list. The task is to create a clone of this linked list in O(N) time. 

//Note: The pointer pointing to the next node is ‘next‘ pointer and the one pointing to an arbitrary node is called ‘arbit’ pointer as it can point to any arbitrary node in the linked list. 
//Follow the steps mentioned beloved to implement the above idea:

//Create a duplicate (say Y) for each node (say X) and map them with corresponding old nodes (say mp, So mp[X] = Y).
//Create the single linked list of the duplicate nodes where each node only has the ‘next’ pointer.
//Now iterate over the old linked list and do the following:
//Find the duplicate node mapped with the current one. (i.e., if the current node is X then duplicate is mp[x])
//Make the arbit pointer of the duplicate node pointing to the duplicate of the current->arbit node (i.e., mp[x]->arbit will point to mp[X->arbit]).
//The linked list created in this way is the required linked list. 
//Follow the illustration below for a better understanding:



 
#include <bits/stdc++.h>
using namespace std;
 
// Structure of a node of linked list
struct Node {
    int val;
    Node* next;
    Node* arbit;
   
    // Constructor
    Node(int x)
    {
        this->val = x;
        this->next = NULL;
        this->arbit = NULL;
    }
};
 
// Function to clone the linked list
Node* cloneLinkedList(Node* head)
{
    // Map to store the mapping of
    // old nodes with new ones
    unordered_map<Node*, Node*> mp;
    Node *temp, *nhead;
   
    // Duplicate of the first node
    temp = head;
    nhead = new Node(temp->val);
    mp[temp] = nhead;
   
    // Loop to create duplicates of nodes
    // with only next pointer
    while (temp->next != NULL) {
        nhead->next
            = new Node(temp->next->val);
        temp = temp->next;
        nhead = nhead->next;
        mp[temp] = nhead;
    }
    temp = head;
   
    // Loop to clone the arbit pointers
    while (temp != NULL) {
        mp[temp]->arbit = mp[temp->arbit];
        temp = temp->next;
    }
   
    // Return the head of the clone
    return mp[head];
}
 
// Function to print the linked list
void printList(Node* head)
{
    cout << head->val << "("
         << head->arbit->val << ")";
    head = head->next;
    while (head != NULL) {
        cout << " -> " << head->val << "("
             << head->arbit->val << ")";
        head = head->next;
    }
    cout << endl;
}
 
// Driver code
int main()
{
    // Creating a linked list with random pointer
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next
        = new Node(5);
    head->arbit = head->next->next;
    head->next->arbit = head;
    head->next->next->arbit
        = head->next->next->next->next;
    head->next->next->next->arbit
        = head->next->next;
    head->next->next->next->next->arbit
        = head->next;
   
    // Print the original list
    cout << "The original linked list:\n";
    printList(head);
   
    // Function call
    Node* sol = cloneLinkedList(head);
   
    cout << "The cloned linked list:\n";
    printList(sol);
   
    return 0;
}
