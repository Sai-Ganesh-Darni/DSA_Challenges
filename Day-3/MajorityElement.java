import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        int count =0,candidate=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(majorityElement(arr));  
    }
}
