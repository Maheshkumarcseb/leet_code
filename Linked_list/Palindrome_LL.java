package leet_code.Linked_list;

public class Palindrome_LL {
     public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single element is a palindrome
        }

        // Find the middle node using fast and slow pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode reversedHalf = reverseList(slow);

        // Compare the first half with the reversed second half
        while (head != null && reversedHalf != null) {
            if (head.val != reversedHalf.val) {
                return false;
            }
            head = head.next;
            reversedHalf = reversedHalf.next;
        }

        return true; // Both halves matched, it's a palindrome
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev; // Reverse the link
            prev = current;
            current = next;
        }
        return prev; // The new head of the reversed list
    }

    public static void main(String[] args) {
        // Example linked list creation
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        // head.next.next = new ListNode(2); // Uncomment for a palindrome
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Palindrome_LL Palindrome_LLobj = new Palindrome_LL();
        boolean isPalindrome = Palindrome_LLobj.isPalindrome(head);

        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}