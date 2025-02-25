import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.close();
        
        int floor = 1;
        
        int maxFloor  = 1;
        
        while(n>maxFloor){
            maxFloor  +=6*floor;
            floor++;
        }
        System.out.println(floor);
    }
}