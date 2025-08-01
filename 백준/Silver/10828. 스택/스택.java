import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            String  s = sc.next();
            switch(s){
                case "push":
                    int a = sc.nextInt();
                    list.add(a);
                    break;
                case "pop":
                    if(list.size() == 0){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(list.get(list.size()-1));
                        list.remove(list.size()-1);
                    }
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    if(list.size() == 0){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(list.size() == 0){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(list.get(list.size()-1));                        
                    }
                    break;
            }
        }
    }
}