import java.util.Scanner;

public class SortList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public static ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(rightHead);
        return merge(left,right);
    }
    public static ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                l1=l1.next;       
                temp = temp.next;         
            }
            else{
                temp.next = l2;
                l2=l2.next;
                temp = temp.next;
            }
        }
        while(l1!=null)
        {
            temp.next = l1;
            l1=l1.next;
            temp = temp.next;
        }
        while(l2!=null)
        {
            temp.next = l2;
            l2=l2.next;
            temp = temp.next;
        }        
        return newHead.next;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        head = sortList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        sc.close();
    }
}
