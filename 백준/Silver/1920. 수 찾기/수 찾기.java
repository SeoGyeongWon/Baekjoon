import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        boolean[] isTrue = new boolean[m];
        for(int i =0; i<m; i++){
            int b = sc.nextInt();
            if(set.contains(b)){
                isTrue[i] = true;
            }
        }
        
        for(boolean b : isTrue){
            System.out.println(b? 1: 0);
        }
    }
}