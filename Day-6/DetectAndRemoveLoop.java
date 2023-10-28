import java.util.Scanner;

public class DetectAndRemoveLoop {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void removeLoop(Node head){
        boolean isLoop = false;
        Node slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                isLoop = true;
                break;
            }
        }
        if(!isLoop)return;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        while(fast.next!=slow){
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node temp = head;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        int pos = sc.nextInt();
        Node curr = head;
        Node posNode = null;
        while(curr.next!=null){
            if(pos==1)posNode = curr;
            curr = curr.next;
            pos--;
        }
        curr.next = posNode;
        removeLoop(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        sc.close();
    }    
}
