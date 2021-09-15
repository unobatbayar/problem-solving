/* 
Linked lists can be measured as a form of high-level standpoint as being a series of nodes where each node has at least one single pointer to the next connected node, and in the case of the last node, a null pointer is used for representing that there will be no further nodes in the linked list. In the data structure, you will be implementing the linked lists which always maintain head and tail pointers for inserting values at either the head or tail of the list is a constant time operation. Randomly inserting of values is excluded using this concept and will follow a linear operation. As such, linked lists in data structure have some characteristics which are mentioned below:

    Insertion is O(1)
    Deletion is O(n)
    Searching is O(n)

Linked lists have a few key points that usually make them very efficient for implementing. These are:

    the list is dynamic and hence can be resized based on the requirement
    Secondly, the insertion is O(1).

Reference: https://www.w3schools.in/data-structures-tutorial/linked-list/
Reference: https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
*/
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
} 

