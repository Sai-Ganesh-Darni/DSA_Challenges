import java.util.Scanner;

public class RotateList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int len = len(head);
        k = k%len;
        if(k==0)
            return head;
        ListNode temp = reverseK(head,len,len);
        ListNode res = reverseK(temp,k,len);
        return res;
    }
    public static int len(ListNode head)
    {
        int i=0;
        ListNode temp = head;
        while(temp!=null)
        {            
            temp = temp.next;
            i++;
        }
        return i;
    }
    public static ListNode reverseK(ListNode head,int k,int n)
    {
        if(head==null)
            return head;
        ListNode prev = null,curr = head,next;
        int i=0;
        while(i<k && curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        ListNode temp = reverseK(curr,n-k,n);
        head.next = temp;
        return prev;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        for (int i = 0; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        int k = sc.nextInt();
        head = rotateRight(head.next,k);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        sc.close();
    }
}
