import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[][] board = new boolean[100][100];
        int count = 0;
        int num = sc.nextInt();
        
        for(int k = 0; k <num; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int i = x; i <x+10; i++){
                for(int j = y; j<y+10; j++){
                    if(board[i][j] != true){
                        board[i][j] = true;
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
        sc.close();
    }
}