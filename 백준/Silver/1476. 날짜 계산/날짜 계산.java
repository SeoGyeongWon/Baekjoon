import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        
        int year = 0;
        do{
            ++year;
        }while((year-E)%15 != 0 || (year-S)% 28 != 0|| (year-M)%19 != 0);
        System.out.println(year);
    }
}