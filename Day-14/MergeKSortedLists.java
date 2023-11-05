import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>q= new PriorityQueue<ListNode>((a,b)->(a.val-b.val));
        for(ListNode i:lists)
        {
            if(i!=null)
            q.add(i);
        }
        ListNode head=null;
        ListNode tail=null;
        while(!q.isEmpty())
        {
            ListNode p=q.poll();
            if(head==null)
            {
                head=p;
                tail=p;
            }
            else
            {
                tail.next=p;
                tail=p;
            }
            if(p.next!=null)
            {
                q.add(p.next);
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode[] list = new ListNode[n];
        for(int i=0;i<n;i++)
        {
            int numOfNodes = sc.nextInt();
            ListNode head = new ListNode();            
            ListNode tempHead = head;
            while(numOfNodes-->0){
                ListNode temp = new ListNode(sc.nextInt());
                tempHead.next = temp;
                tempHead =  tempHead.next;
            }
            list[i] = head.next;
        }
        ListNode res = mergeKLists(list);
        while(res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
        sc.close();
    }
}
