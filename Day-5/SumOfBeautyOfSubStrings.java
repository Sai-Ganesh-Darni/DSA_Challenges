import java.util.Scanner;

public class SumOfBeautyOfSubStrings {
    public static int beautySum(String s) {
        int len = s.length();
        int sum = 0;        
        for(int i=0;i<len;i++){
            int[] freq = new int[26];
            for(int j=i;j<len;j++){
                freq[s.charAt(j)-'a']++;
                sum+=beautyCal(freq);
            }
        }
        return sum;
    }
    public static int beautyCal(int[] freq){
        int min = Integer.MAX_VALUE, max = 0;
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i]<min)
                min = freq[i];
            if(freq[i]>max)
                max = freq[i];
        }
        return max - min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(beautySum(s));
        sc.close();
    }   
}
