import java.util.*;

public class Main{
    static int n,m;
    static int[][] af, bf;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    n = sc.nextInt();
    m = sc.nextInt();
    
    af = new int[n][m];
    bf = new int[n][m];
    
    for(int i = 0; i<n; i++){
        String str = sc.next();
        for(int j = 0; j<m; j++){
            af[i][j] = str.charAt(j)-'0';
        }
    }
    for(int i = 0; i<n; i++){
        String str = sc.next();
        for(int j = 0; j<m; j++){
            bf[i][j] = str.charAt(j)-'0';
        }
    }
    int count =  0;
    
    for(int i = 0; i<=n-3; i++){
        for(int j = 0; j<=m-3; j++){
            if(af[i][j] != bf[i][j]){
                //여기서 sbmatrix
                sbMatrix(i,j);
                count++;
            }
        }
    }
    if(isEquals()){
        System.out.println(count);
    }
    else{
        System.out.println(-1);
    }
 }
    static void sbMatrix(int x, int y){
        for(int i = x; i<x+3; i++){
            for(int j = y; j<y+3; j++){
                af[i][j] = 1-af[i][j];
            }
        }
    }
    static boolean isEquals(){
        for(int i =0; i<n; i++){
            for(int j= 0; j<m; j++){
                if(af[i][j] != bf[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}