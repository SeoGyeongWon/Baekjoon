import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
               
        
        boolean[][] isWhite = new boolean[8][8];
        
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(i%2 ==1 && j%2==1){
                    isWhite[i][j] = true;
                }
                else if(i%2==0 && j%2 ==0){
                    isWhite[i][j] = true;                   
                }
            }
        }
        int count = 0;
        for(int i = 0; i<8; i++){
            String s = sc.nextLine();
            for(int j = 0; j<8; j++){
                char c = s.charAt(j);
                if(c == 'F' && isWhite[i][j] == true){
                    count++;
                }
            }
        }
            System.out.println(count);       
    }
}