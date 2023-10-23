public class ReverseArray
{
    public static void reverseArray(int arr[])
    {
        int len = arr.length;
        int l=0,r=len-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void printArray(int arr[]){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
}