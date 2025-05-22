import java.util.*;

public class Main{
    static int w,h;
    static int[][] island;
    static boolean[][] isVisited;
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    static int[] dy = {-1,0,1,1,1,0,-1,-1};
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w== 0 && h==0){
                break;
            }
            island = new int[h][w];
            isVisited = new boolean[h][w];
            
            for(int i =0; i<h; i++){
                for(int j =0; j<w; j++){
                    island[i][j] = sc.nextInt();
                }
            }
            int count =0;
            for(int i=0; i<h; i++){
                for(int j =0; j<w; j++){
                    if(!isVisited[i][j] && island[i][j] == 1){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }        
    }
    public static void dfs(int x, int y){
        isVisited[x][y] = true;
        for(int i = 0; i<8; i++){
            int nx = x + dx[i];
            int ny = y+ dy[i];
            
            if(nx<0 || nx >=h || ny <0 || ny>=w){continue;}
            if(!isVisited[nx][ny] && island[nx][ny] == 1){
                 dfs(nx,ny);
            }            
            
        }
    }
}