import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for(int i =0; i<test; i++){
            int c = sc.nextInt();
            
            int countQ = 0, countD = 0, countN = 0, countP=0;
            
            countQ = c/25;
            c = c%25;
            
            countD = c/10;
            c = c%10;
            
            countN = c/5;
            c = c%5;
            
            countP = c;
            
            System.out.println(countQ + " " + countD + " " + countN + " " + countP);
        }
        sc.close();
    }
}