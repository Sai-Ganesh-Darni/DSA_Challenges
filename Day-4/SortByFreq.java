import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortByFreq {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        pq.addAll(map.keySet());
        String res="";
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<map.get(ch);i++){
                res+=ch;
            }
        } 
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(frequencySort(str));
        sc.close();
    }
}
