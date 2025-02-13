import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[][] matrix = new char[5][15];
        
        for(int i =0; i<5;i++){
            String line = sc.nextLine();
            for(int j =0; j<line.length(); j++){
                matrix[i][j] = line.charAt(j);
            }
        }
        for(int j = 0; j<15; j++){
            for(int  i =0; i<5; i++){
                if(matrix[i][j] != '\u0000'){
                    System.out.print(matrix[i][j]);
                }
            }
        }
        sc.close();
    }
}