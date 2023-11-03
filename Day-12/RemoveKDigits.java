import java.util.Stack;
import java.util.Scanner;
public class RemoveKDigits
{
    public static String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(char ch:num.toCharArray()){
            while(!stk.isEmpty() && ch<stk.peek() && k>0){
                stk.pop();
                k--;
            }
            if(stk.isEmpty() && ch=='0')
                continue;
            stk.push(ch);
        }
        while(!stk.isEmpty() && k-->0)
            stk.pop();
        if(stk.isEmpty())
            return new String("0");
        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty()){
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        System.out.println(removeKdigits(num, k));
        sc.close();
    }
}