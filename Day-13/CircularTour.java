import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;


public class CircularTour {
    //Using Queue
    static int tour(int petrol[], int distance[])
    {
	    Queue<Integer> q=new ArrayDeque<>();
        int l=petrol.length;
        int n=0,d=0,i=0;
        while(i<l){
            int a=petrol[i];
            int b=distance[i];
            int diff=a-b;
            d+=diff;
            if(d<0){
                if(i==l-1){
                    return -1;
                }
                n=i+1;
                d=0;
            }
            q.offer(b);
            i++;
        }
        int temp=0;
        while(temp<n){
            d+=petrol[temp]-q.poll();
            temp++;
            if(d<0){
                return -1;
            }
        }
        return n;
    }

    //Space optimized
    static int tour2(int petrol[], int distance[]) 
    {
  int left =0; int right=0; int dis =distance[0]; int pet =petrol[0];
 
        while(left<petrol.length){
 
            if(pet<dis){
                if(left==right){
                    left +=1;
                    if(left==petrol.length){
                        return -1;
                    }
                    pet = petrol[left];
                    dis = distance[left];
                    right= left;
                    continue;
                }
                dis -= distance[left];
                pet -= petrol[left++];
            }
            else{
                right=(right+1)%petrol.length;
 
                pet +=petrol[right];
                dis += distance[right];
                if(right==left){
                    return left;
                }
            }
        }
 
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int petrol[] = new int[n];
        int distance[] = new int[n];
        for(int i=0;i<n;i++){
            petrol[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            distance[i] = sc.nextInt();
        }
        System.out.println(tour(petrol, distance));
        System.out.println(tour2(petrol, distance));
        sc.close();
    }
}
