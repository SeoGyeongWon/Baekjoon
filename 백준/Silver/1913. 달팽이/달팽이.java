import java.util.Scanner;

class Main{
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int n;
    static int[][] snail;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        snail = new int[n][n];
        int target = sc.nextInt();
        
        int x = 0 , y=0;
        int dir = 0;
        int num = n*n;
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                snail[i][j] = 0;
            }
        }
        while(num >0){
            snail[x][y] = num--;
            int nx = x+dx[dir];
            int ny = y+dy[dir];
            
            if(nx < 0|| nx >= n || ny <0 || ny >=n || snail[nx][ny] != 0){
                dir = (dir+1)%4;
                nx = x +dx[dir];
                ny = y+dy[dir];
            }
            x = nx;
            y = ny;            
        }
        int targetX = 0, targetY = 0;
        for(int i =0; i < n; i++){
            for(int j =0; j<n; j++){
                System.out.print(snail[i][j]+" ");
                if(target == snail[i][j]){
                    targetX = i;
                    targetY = j;
                }
            }
            System.out.println();
        }
        System.out.println((targetX+1) + " "+(targetY+1));
    }
}