import java.util.Stack;
import java.util.Scanner;
public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i:asteroids){
            while(!stk.isEmpty() && (stk.peek()>0 && i<0)){
                int k = stk.peek()+i;
                if(k<0){
                    stk.pop();
                }
                else if(k>0){
                    i = 0;
                }
                else{
                    i = 0;
                    stk.pop();
                }
            }
            if(i!=0)
                stk.push(i);
        }
        int size = stk.size();
        int[] res = new int[size];
        size--;
        while(!stk.isEmpty()){
            res[size--] = stk.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int asteroids[] = new int[n];
        for(int i=0;i<n;i++){
            asteroids[i] = sc.nextInt();
        }
        int res[] = asteroidCollision(asteroids);
        for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
        sc.close();
    }    
}
