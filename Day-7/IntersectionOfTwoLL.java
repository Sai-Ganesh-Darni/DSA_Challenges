public class IntersectionOfTwoLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA,temp2 = headB;
        int lenA=0,lenB=0;
        while(temp1!=null)
        {
            lenA++;
            temp1=temp1.next;            
        }
        while(temp2!=null)
        {
            lenB++;
            temp2=temp2.next;            
        }
        temp1=headA;
        temp2=headB;
        if(lenA>lenB)
        {
            int c = lenA-lenB;
            for(int i=0;i<c;i++)
            {
                temp1=temp1.next;
            }
        }
        else{
            int c = lenB-lenA;
            for(int i=0;i<c;i++)
            {
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }  
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;
        System.out.println(getIntersectionNode(headA, headB).val);
    }  
}
