import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxX = Integer.MIN_VALUE, minX = Integer.MAX_VALUE;
        
        int maxY = Integer.MIN_VALUE, minY = Integer.MAX_VALUE;
        
       
        
        for(int i =0; i <n; i++){
            int x = sc.nextInt();
            int y=  sc.nextInt();
            
            if(x>maxX){maxX = x;}
            if(x<minX){minX = x;}
            if(y>maxY){maxY = y;}
            if(y<minY){minY = y;}
        }
        
        int row = maxX-minX;
        
        int col = maxY-minY;
        
        System.out.println(row*col);
       
        sc.close();
    }
}