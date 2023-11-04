import java.util.Scanner;

public class FirstNegativeInEveryKWindow {
    public static long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        long[] ans=new long[N-k+1];
        int low=0,high=low+k-1,mid=low,i=0;
        while(high<N){
            mid=low;
            while(mid<=high&&A[mid]>0){
                    mid++;
            }
            if(mid>high){
                ans[i]=0;
            }
            else{
                ans[i]=A[mid];
            }
            i++;
            low++;
            high++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long A[] = new long[n];
        for(int i=0;i<n;i++)    
            A[i] = sc.nextLong();
        int k = sc.nextInt();
        long res[] = printFirstNegativeInteger(A, n, k);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        sc.close();
    }
}
