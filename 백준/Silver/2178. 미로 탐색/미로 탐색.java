import java.util.*;

public class Main{
    static int n,m;
    static int[][] mirro;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] isVisited;
    static int[][] dist;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        mirro = new int[n][m];
        isVisited = new boolean[n][m];
        dist = new int[n][m];
        for(int i =0; i<n; i++){
            String s = sc.next();
            for(int j = 0; j<m; j++){
                mirro[i][j] = s.charAt(j) - '0';
            }
            
        }

                    bfs(0,0);
        System.out.print(dist[n-1][m-1]);

    }
    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        isVisited[x][y] = true;
        
        dist[x][y] =1;
        while(!q.isEmpty()){
            int[] now = q.poll();
            int curX = now[0];
            int curY = now[1];
            
            for(int dir = 0; dir<4; dir++){
                int nx = curX+dx[dir];
                int ny = curY+dy[dir];
                if(nx<0 || nx >= n || ny <0 || ny>=m){
                    continue;
                }
                if(!isVisited[nx][ny] && mirro[nx][ny] == 1){
                    q.offer(new int[]{nx,ny});
                    isVisited[nx][ny] = true;
                    dist[nx][ny] = dist[curX][curY] + 1;
                }
            }
        }
    }
}