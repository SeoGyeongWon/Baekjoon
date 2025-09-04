import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String solution = sc.nextLine();
        
        int count = 0;
        for(int i=0; i<=text.length()- solution.length();){
            if(text.substring(i, i+solution.length()).contains(solution)){
                count ++;
                i += solution.length();
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}