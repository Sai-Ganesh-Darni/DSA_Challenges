import java.util.Stack;
import java.util.Scanner;
public class TrappingRainWater {
    public static int trap(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int n = height.length;
        int res = 0;
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && height[stk.peek()]<height[i]){
                int top = height[stk.pop()];
                if(stk.isEmpty())
                    break;
                int dis = i-stk.peek()-1;
                int len = Math.min(height[stk.peek()],height[i])-top;
                res+=dis*len;
            }
            stk.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(trap(height));
        sc.close();
    }    
}
