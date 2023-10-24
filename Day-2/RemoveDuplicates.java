public class RemoveDuplicates {
    public static int removeDup(int[] arr){
        int len = arr.length;
        int j=1;
        for(int i=1;i<len;i++){
            if(arr[i]!=arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void printArr(int[] arr,int k){
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,4,4,5,6};
        int k = removeDup(arr);
        printArr(arr, k);
    }
}
