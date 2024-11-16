package leet_code.Linked_list;



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class DeleteMiddleLL {
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: if the list is empty or has only one node, return null
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head.next.next;

        // Use two pointers to find the middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip the middle node
        slow.next = slow.next.next;
        return head;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Main function to test the deleteMiddle method
    public static void main(String[] args) {
        DeleteMiddleLL DeleteMiddleLLobj = new DeleteMiddleLL();

        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createLinkedList(arr1);
        System.out.print("Original list: ");
        printList(head1);
        ListNode result1 = DeleteMiddleLLobj.deleteMiddle(head1);
        System.out.print("After deleting middle: ");
        printList(result1);

        // Test case 2
        int[] arr2 = {1, 2, 3, 4};
        ListNode head2 = createLinkedList(arr2);
        System.out.print("Original list: ");
        printList(head2);
        ListNode result2 = DeleteMiddleLLobj.deleteMiddle(head2);
        System.out.print("After deleting middle: ");
        printList(result2);

        // Test case 3
        int[] arr3 = {1, 2};
        ListNode head3 = createLinkedList(arr3);
        System.out.print("Original list: ");
        printList(head3);
        ListNode result3 = DeleteMiddleLLobj.deleteMiddle(head3);
        System.out.print("After deleting middle: ");
        printList(result3);

        // Test case 4
        int[] arr4 = {1};
        ListNode head4 = createLinkedList(arr4);
        System.out.print("Original list: ");
        printList(head4);
        ListNode result4 = DeleteMiddleLLobj.deleteMiddle(head4);
        System.out.print("After deleting middle: ");
        printList(result4);
    }
}
