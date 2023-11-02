import java.util.Scanner;
import java.util.Stack;
public class SumOfSubArrayMinimums {
    public static int sumSubarrayMins(int[] arr) {
        final int modulo = 1_000_000_007;
        int[] stack = new int[arr.length + 1];
        int idxStack = 0;
        long res = 0;
        for (int i = 1; i <= arr.length; i++) {
            while (idxStack >= 0 && (i == arr.length || arr[stack[idxStack]] > arr[i])){
                int idx = stack[idxStack--];
                int leftIdx = idxStack < 0 ? -1 : stack[idxStack];
                res += 1l * arr[idx] * (i - idx) * (idx - leftIdx);
            }
            stack[++idxStack] = i;
        }
        return (int) (res % modulo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(sumSubarrayMins(arr));
    }
}
