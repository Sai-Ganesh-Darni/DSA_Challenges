import java.util.Scanner;

public class ReverseLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
        A = reverseList(A);
        while(A!=null){
            System.out.print(A.val+" ");
            A=A.next;
        }
        sc.close();
    }
}
