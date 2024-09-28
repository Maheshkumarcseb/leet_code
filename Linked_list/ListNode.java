package leet_code.Linked_list;
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  // Method to insert a node at the beginning
  public ListNode insertAtBeginning(ListNode head, int valToInsert) {
    ListNode newNode = new ListNode(valToInsert);
    newNode.next = head;
    head = newNode;
    return head;
  }

  // Method to insert a node at the end
  public ListNode insertAtEnd(ListNode head, int valToInsert) {
    ListNode newNode = new ListNode(valToInsert);
    if (head == null) return newNode;  // If the list is empty, make newNode the head

    ListNode ptr = head;
    while (ptr.next != null) ptr = ptr.next;
    ptr.next = newNode;

    return head;
  }

  // Method to insert a node in the middle at a specific position
  public ListNode insertInMiddle(ListNode head, int valToInsert, int position) {
    if (position == 0) return insertAtBeginning(head, valToInsert);

    ListNode newNode = new ListNode(valToInsert);
    ListNode ptr = head;

    // Traverse to the node before the insertion point
    for (int i = 0; i < position - 1; i++) {
      if (ptr == null || ptr.next == null) {
        System.out.println("Position out of bounds.");
        return head; // Return the list unchanged if the position is invalid
      }
      ptr = ptr.next;
    }

    newNode.next = ptr.next;
    ptr.next = newNode;

    return head;
  }

  // Method to delete a node from the beginning
  public ListNode deleteFromBeginning(ListNode head) {
    if (head == null) return null; // Handle empty list
    return head.next; // New head is the next node
  }

  // Method to delete a node from the end
  public ListNode deleteAtEnd(ListNode head) {
    if (head == null || head.next == null) return null; // Empty or single-node list

    ListNode ptr = head;
    while (ptr.next.next != null) ptr = ptr.next; // Find the second last node
    ptr.next = null; // Remove the last node
    return head;
  }

  // Method to delete a node from the middle at a specific position
  public ListNode deleteFromMiddle(ListNode head, int position) {
    if (head == null || position == 0) return deleteFromBeginning(head);

    ListNode ptr = head;
    for (int i = 0; i < position - 1; i++) {
      if (ptr.next == null) {
        System.out.println("Position out of bounds.");
        return head; // Return the list unchanged if the position is invalid
      }
      ptr = ptr.next;
    }

    if (ptr.next == null) return head; // If there's no node at the position
    ptr.next = ptr.next.next; // Delete the node

    return head;
  }

  // Method to traverse the linked list
  public void traverseALinkedList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // Main method to test the linked list operations
  public static void main(String[] args) {
    ListNode list = new ListNode(4);
    ListNode l2 = new ListNode(8);
    ListNode l3 = new ListNode(15);
    list.next = l2;
    l2.next = l3;

    ListNode head = list;
    head.traverseALinkedList(head);

    // Insert at the beginning
    head = head.insertAtBeginning(head, 2);
    head.traverseALinkedList(head);

    // Insert at the end
    head = head.insertAtEnd(head, 20);
    head.traverseALinkedList(head);

    // Insert in the middle
    head = head.insertInMiddle(head, 12, 3);
    head.traverseALinkedList(head);

    // Delete from the beginning
    head = head.deleteFromBeginning(head);
    head.traverseALinkedList(head);

    // Delete from the end
    head = head.deleteAtEnd(head);
    head.traverseALinkedList(head);

    // Delete from the middle
    head = head.deleteFromMiddle(head, 2);
    head.traverseALinkedList(head);
  }
}
