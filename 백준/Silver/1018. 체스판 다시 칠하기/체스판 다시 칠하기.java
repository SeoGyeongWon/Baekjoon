import java.util.StringTokenizer;
import java.io.*;

public class Main{
    static boolean[][] chess;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        chess = new boolean[m][n];
        
        for(int i =0; i<m;i++){
            String color = br.readLine();
            for(int j=0; j<n; j++){
                chess[i][j] = (color.charAt(j)=='B');
            }
        }
        for(int i =0;i<=m-8;i++){
            for(int j=0;j<=n-8;j++){
                min = Math.min(min,getMinCount(i,j));
            }
        }
        System.out.println(min);
    }
    
    public static int getMinCount(int x, int y){
        int B = 0;
        int W = 0;
        
        for(int i = 0; i<8; i++){
            for(int j =0; j<8;j++){
                boolean expected =((i+j)%2==0);
                if(chess[x+i][y+j] !=expected){B++;}
                else{W++;}
                    
            }
        }
        return Math.min(B,W);
    }
}