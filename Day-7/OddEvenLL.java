import java.util.Scanner;

public class OddEvenLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        if (head.next.next == null) return head;
        ListNode oddHead = head, evenHead = head.next;
        ListNode oddCurrent = oddHead, evenCurrent = evenHead;
        while (oddCurrent != null) {
            ListNode tempEven = oddCurrent.next;
            if (oddCurrent.next != null) {
                oddCurrent.next = oddCurrent.next.next;
            }

            evenCurrent.next = tempEven;
            evenCurrent = evenCurrent.next;
            if (oddCurrent.next == null) break;
            oddCurrent = oddCurrent.next;
        }
        oddCurrent.next = evenHead;
        return oddHead;
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
        head = oddEvenList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        sc.close();
    }
}
