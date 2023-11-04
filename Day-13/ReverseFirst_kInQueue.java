import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class ReverseFirst_kInQueue
{
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        recur(q,k);
        int n= q.size()-k;
        while(n>0){
            q.add(q.poll());
            n--;
        }
        return q;
        
    }
    public static void recur(Queue<Integer> q,int k)
    {
        if(k==0)
            return;
        int temp = q.poll();
        recur(q,k-1);
        q.add(temp);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        System.out.println(modifyQueue(q, n));
        sc.close();
    }
}