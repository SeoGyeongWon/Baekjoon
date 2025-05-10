import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int minPack = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;
        
        for(int i = 0; i<n; i++){
            int pack = sc.nextInt();
            int single = sc.nextInt();
            
            minPack = Math.min(minPack, pack);
            minSingle = Math.min(minSingle, single);
        }
        int case1 = m*minSingle;
        int case2 = (m+5)/6*minPack;
        int case3 = (m/6)*minPack + (m%6)*minSingle;
        
        int result = Math.min(case1, Math.min(case2,case3));
        System.out.println(result);
    }
}