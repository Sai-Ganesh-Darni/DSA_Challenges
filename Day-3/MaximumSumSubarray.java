import java.util.Scanner;
public class MaximumSumSubarray {
    public static int maxSubArray(int[] nums) {
        int cs =0,ms = Integer.MIN_VALUE,temp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs+=nums[i];
            if(nums[i]>temp)
            {
                temp=nums[i];
            }
            if(cs<0)
            {
                cs=0;
            }
            else if(ms<cs)
            {
                ms=cs;
            }
        }
        if(cs==0)
        {
            if(ms>temp)
                return ms;
            return temp;
        }
        return ms;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxSubArray(arr));  
    }
}
