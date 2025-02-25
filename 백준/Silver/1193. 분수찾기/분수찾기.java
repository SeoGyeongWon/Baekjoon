import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int floor = 1 , x = new Scanner(System.in).nextInt();
        while(x>floor){
            x -= floor++;
        }
        System.out.println((floor%2==0?x: floor-x+1)+"/"+(floor%2==0 ? floor-x+1 : x));
    }
}