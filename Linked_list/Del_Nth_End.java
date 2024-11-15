package leet_code.Linked_list;
/*
 * time complexity :-- O(cnt)+O(cnt-N)
 * Space complexitu:-- O(1)
 */



/* 
class Node{
    public int data;
    public Node next;

    public Node(int data1, Node next1)
    {
        data=data1;
        next=next1;
    }
    public Node(int data1)
    {
        data=data1;
        next=null;
    }
}
public class Del_Nth_End {
    public static void PrintLL(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static Node DeleteNthNodeFromEnd(Node head, int N)
    {
        if(head ==null){
            return null;
        }
        int cnt =0;
        Node temp=head;

        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        if(cnt ==N){
            Node newhead = head.next;
            head=null;
            return newhead;
        }
        int res=cnt-N;
        temp=head;
        while(temp!=null)
        {
            res--;
            if(res ==0)
                break;
            temp=temp.next;
        }
        Node delNode=temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int N=3;
        Node head = new Node(arr[0]);
        head.next= new Node(arr[1]);
        head.next.next= new Node(arr[2]);
        head.next.next.next= new Node(arr[3]);
        head.next.next.next.next= new Node(arr[4]);
        head= DeleteNthNodeFromEnd(head, N);
        PrintLL(head);
    }
}


*/

/*
 * Optimal approach using slow and fast pointer
 * time complexity  :--O(N)
 * space complexity :--O(1)
 */


 class Node{
    public int data;
    public Node next;

    public Node(int data1, Node next1)
    {
        data=data1;
        next=next1;
    }
    public Node(int data1)
    {
        data=data1;
        next=null;
    }
}
    public class Del_Nth_End{
        public static void printLL(Node head)
        {
            while(head != null){
                System.out.print(head.data +" ");
                head=head.next;
            }
        }
        public static Node DeleteNthNodeFromEnd(Node head, int N)
        {
            Node fastp=head;
            Node slowp=head;

            for(int i=0; i<N; i++)
                fastp=fastp.next;

            if(fastp==null)
                return head.next;

            while(fastp.next != null)
            {
                fastp=fastp.next;
                slowp=slowp.next;
            }
            Node delNode = slowp.next;
            slowp.next =slowp.next.next;
            delNode=null;
            return head;
        }
        public static void main(String[] args)
        {
            int[] arr ={1,2,3,4,5};
            int N=3;

            Node head = new Node(arr[0]);
            head.next= new Node(arr[1]);
            head.next.next= new Node(arr[2]);
            head.next.next.next= new Node(arr[3]);
            head.next.next.next.next= new Node(arr[4]);
            head= DeleteNthNodeFromEnd(head, N);
            printLL(head);
        }
    }
 
