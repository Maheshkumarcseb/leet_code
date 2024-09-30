package leet_code.Linked_list;

public class Middle_LL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Example linked list creation
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Middle_LL Middle_LLobj = new Middle_LL();
        ListNode middleNode = Middle_LLobj.middleNode(head);

        // Print the value of the middle node
        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.val);
        } else {
            System.out.println("Linked list is empty.");
        }
    }
}