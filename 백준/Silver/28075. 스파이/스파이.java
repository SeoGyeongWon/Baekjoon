import java.util.Scanner;

class Main{
    static int N, M, count;
    static int[] info;
    static int[] spy;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        info = new int[3];
        for(int i = 0; i<3; i++){
            info[i] = sc.nextInt();
        }
        spy = new int[3];
        for(int i = 0; i<3; i++){
            spy[i] = sc.nextInt();
        }
        dfs(0,-1,0);
        System.out.print(count);
        
    }
    static void dfs(int day, int prev, int total){
        if(day == N){
            if(total >= M){
                count++;
            }
            return;
        }
        for(int location = 0; location <3; location++){
            for(int job = 0; job<2; job ++){
                int value = (job == 0)? info[location]:spy[location];
                if(location == prev){
                    value /= 2;
                }
                dfs(day+1, location, total+value);
            }
        }
    }
}