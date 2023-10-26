import java.util.Scanner;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int map1[] = new int[128];
        int map2[] = new int[128];
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1[ch1]!=map2[ch2]){
                return false;
            }
            map1[ch1]=i+1;
            map2[ch2]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isIsomorphic(s, t));
        sc.close();
    }
}
