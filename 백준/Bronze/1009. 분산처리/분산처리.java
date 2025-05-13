import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[][] pattern = {{1,1,1,1},{2,4,8,6},{3,9,7,1},{4,6,4,6},{5,5,5,5},{6,6,6,6},{7,9,3,1},{8,4,2,6},{9,1,9,1},{10,10,10,10}};
        for(int tc = 1; tc<= T; tc++){
            int a = sc.nextInt();
            int b =sc.nextInt();
            
            
            a = a%10;
            
            int index;
            if(a==0){
                index = 9;
            }
            else{
                index = a-1;
            }
            int[] patterns  = pattern[index];
            
            int pIndex = (b-1)%patterns.length;
            
            System.out.println(patterns[pIndex]);
               
        }
    }
}