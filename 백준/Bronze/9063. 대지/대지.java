import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxX = Integer.MIN_VALUE, minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE, minY = Integer.MAX_VALUE;
        
        for(int i = 0; i<n; i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            
            maxX = Math.max(maxX,x);
            minX = Math.min(minX,x);
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
        }
        
        System.out.println((maxX-minX)*(maxY-minY));
        sc.close();
    }
}