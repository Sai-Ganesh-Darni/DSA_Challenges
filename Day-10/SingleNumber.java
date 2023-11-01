import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Single Number: "+singleNumber(arr));
        sc.close();
    }        
}
