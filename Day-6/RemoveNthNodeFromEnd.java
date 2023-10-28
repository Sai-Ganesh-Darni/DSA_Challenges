import java.util.Scanner;

public class RemoveNthNodeFromEnd {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }   
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head,fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null)
            return head.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode A = new ListNode(sc.nextInt());
        ListNode temp = A;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        int B = sc.nextInt();
        A = removeNthFromEnd(A,B);
        while(A!=null){
            System.out.print(A.val+" ");
            A=A.next;
        }
        sc.close();
    }
}
