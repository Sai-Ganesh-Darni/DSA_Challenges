import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement_CircularArray {
    public static int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int res[]  = new int[len];
        Arrays.fill(res,-1);
        Stack<Integer> stk = new Stack<>();
        //Stack contains the indices of elements whose next Greater element is not set yet
        for(int i=0;i<2*len;i++)
        {
            while(!stk.isEmpty() && nums[stk.peek()]<nums[i%len]){ // It checks whether the element is greater than the Stack peek element, if so it is set as next greater element
                res[stk.pop()] = nums[i%len];
            }
            if(i<len)
                stk.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = nextGreaterElements(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
