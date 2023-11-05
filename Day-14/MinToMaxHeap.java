import java.util.Scanner;

public class MinToMaxHeap {
    public static void heapify(int arr[], int i) {
        int index = i;
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < arr.length && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < arr.length && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(arr, largest);
        }
    }
    public static int[] minToMaxHeap(int n, int[] arr) {
        int parent = (n / 2) - 1;
        for (int i = parent; i >= 0; i--) {
            heapify(arr, i);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int res[] = minToMaxHeap(n, arr);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        sc.close();
    }    
}
