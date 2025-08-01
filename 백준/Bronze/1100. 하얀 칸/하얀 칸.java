import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[][] arr = new char[8][8];
        
        for(int i = 0; i<8; i++){
            if(i % 2== 0){
                for(int j = 0; j<8; j++){
                    if(j%2 == 0){
                        arr[i][j] = 'W';
                    }
                    else if(j % 2== 1){
                        arr[i][j] = 'B';
                    }
                }
            }
            else if(i%2 ==1){
                for(int j = 0; j < 8; j++){
                    if(j%2 == 1){
                        arr[i][j] = 'W';
                    }
                    else if(j%2 == 0){
                        arr[i][j] = 'B';
                    }
                }
            }
            
        }
        int count = 0;
        for(int i = 0; i<8; i++){
           String s = sc.next();
            for(int j= 0; j<8; j++){
                char c = s.charAt(j);
                if(arr[i][j] == 'W' && c == 'F'){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}