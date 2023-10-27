import java.util.Scanner;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String res="";
        int len = str.length;
        for(int i=len-1;i>0;i--)
            res+=str[i]+" ";
        return res+=str[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
        sc.close();
    }
}
