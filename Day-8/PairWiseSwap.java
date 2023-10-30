import java.util.Scanner;

public class PairWiseSwap {
    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }
    public static Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null ||head.next==null) return head;
         Node nextNode=head.next;
         head.next=pairwiseSwap(nextNode.next);
         nextNode.next=head;
         return nextNode;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        head = pairwiseSwap(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }
}
