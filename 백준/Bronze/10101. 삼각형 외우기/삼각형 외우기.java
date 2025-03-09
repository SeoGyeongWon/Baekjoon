import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        System.out.println((a == 60 && b == 60 && c == 60)? "Equilateral" :
        (a+b+c ==180 && (a == b || a ==c || b==c))? "Isosceles":
            (a+b+c ==180 && (a !=b || a!=c || b!=c))?"Scalene" : "Error");
    }
}