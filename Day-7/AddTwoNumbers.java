public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        head.next=null;
        int carry=0;
        ListNode temp=head;
        while(l1!=null && l2!=null)
        {
            ListNode t = new ListNode();
            t.next=null;
            int c=l1.val+l2.val+carry;
            if(c>9)
            {
                carry=1;
                t.val=c%10;
            }
            else{
                carry=0;
                t.val=c;
            }
            temp.next = t;
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
        }         
        while(l1!=null)
        {
            ListNode t = new ListNode();
            t.next=null;
            if(carry!=0)
            {
                int c = l1.val+carry;
                if(c>9)
                {
                    carry=1;
                    t.val=c%10;
                }
                else{
                    carry=0;
                    t.val=c;
                }
            }
            else{
                t.val = l1.val;
            }
            temp.next=t;
            temp = temp.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode t = new ListNode();
            t.next=null;
            if(carry!=0)
            {
                int c = l2.val+carry;
                if(c>9)
                {
                    carry=1;
                    t.val=c%10;
                }
                else{
                    carry=0;
                    t.val=c;
                }
            }
            else{
                t.val = l2.val;
            }
            temp.next=t;
            temp = temp.next;
            l2=l2.next;
        }
        if(carry!=0)
        {
            ListNode t = new ListNode();
            t.val=1;
            t.next=null;
            temp.next=t;
            temp = temp.next;
        }
        return head.next;
    }  
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        ListNode head = addTwoNumbers(l1, l2);
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }  
}
