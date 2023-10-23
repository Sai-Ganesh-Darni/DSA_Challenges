public class RotateArray {
    public static void reverseArray(int arr[],int l,int r)
    {
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
    public static void rotateArray(int arr[],int k){
        int len = arr.length;
        k = k%len;
        reverseArray(arr, 0, len-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, len-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        rotateArray(arr, 3);
        printArray(arr);
    }
}
