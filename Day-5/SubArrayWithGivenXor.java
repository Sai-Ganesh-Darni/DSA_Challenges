import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SubArrayWithGivenXor {
    public static int countOfSubArrays(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int res=0;
        for(int i=0;i<A.size();i++){
            res=res^A.get(i);
            if(res==B){
                count++;
            }
            if(map.containsKey(res^B)){
                count+=map.get(res^B);
            }
            map.put(res,map.getOrDefault(res,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            A.add(sc.nextInt());
        int B = sc.nextInt();
        System.out.println(countOfSubArrays(A,B));
        sc.close();
    }
}
