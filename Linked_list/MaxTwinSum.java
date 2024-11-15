/*
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.
Given the head of a linked list with even length, return the maximum twin sum of the linked list
*/

package leet_code.Linked_list;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MaxTwinSum {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, first = head;
        int maxsum = 0;

        // Finding the middle of the linked list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reversing the second half of the linked list
        ListNode nextNode = slow, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Calculating the maximum twin sum
        while (prev != null) {
            maxsum = Math.max(maxsum, prev.val + first.val);
            prev = prev.next;
            first = first.next;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        MaxTwinSum MaxTwinSumobj = new MaxTwinSum();
        int result = MaxTwinSumobj.pairSum(head);

        // Printing the result
        System.out.println("Maximum twin sum: " + result);
    }
}
