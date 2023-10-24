public class SortColors {
    public static void sort(int arr[])
    {
        int l=0,r=arr.length-1,i=0;
        while(i<=r){
            if(arr[i]==0){
                swap(arr,l++,i++);
            }
            else if(arr[i]==2){
                swap(arr,i,r--);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,0,2,1,1,0};
        sort(arr);
        printArr(arr);
    }
    
}
