package leet_code.Linked_list;

public class MergeTwoSortedLists {

    // Definition for singly-linked list
    public static class ListNode {
      public int val;
      public ListNode next;
  
      public ListNode(int x) {
        val = x;
        next = null;
      }
    }
  
    // Method to merge two sorted lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
  
      // Create a sentinel/dummy node to start
      ListNode returnNode = new ListNode(Integer.MIN_VALUE);
  
      // Create a copy of this node to iterate while solving the problem
      ListNode headNode = returnNode;
  
      // Traverse until one of the lists reaches the end
      while (l1 != null && l2 != null) {
  
        // Compare the two values of lists
        if (l1.val <= l2.val) {
          returnNode.next = l1;
          l1 = l1.next;
        } else {
          returnNode.next = l2;
          l2 = l2.next;
        }
        returnNode = returnNode.next;
      }
  
      // Append the remaining list
      if (l1 == null) {
        returnNode.next = l2;
      } else if (l2 == null) {
        returnNode.next = l1;
      }
  
      // Return the next node to the sentinel node
      return headNode.next;
    }
  
    // Method to print the linked list
    public void printList(ListNode head) {
      ListNode temp = head;
      while (temp != null) {
        System.out.print(temp.val + " -> ");
        temp = temp.next;
      }
      System.out.println("null");
    }
  
    // Main method to test the merging of two sorted lists
    public static void main(String[] args) {
      MergeTwoSortedLists obj = new MergeTwoSortedLists();
  
      // Create first sorted list: 1 -> 3 -> 5
      ListNode l1 = new ListNode(1);
      l1.next = new ListNode(3);
      l1.next.next = new ListNode(5);
  
      // Create second sorted list: 2 -> 4 -> 6
      ListNode l2 = new ListNode(2);
      l2.next = new ListNode(4);
      l2.next.next = new ListNode(6);
  
      // Merge the two sorted lists
      ListNode mergedList = obj.mergeTwoLists(l1, l2);
  
      // Print the merged list
      System.out.println("Merged List:");
      obj.printList(mergedList);
    }
  }
  