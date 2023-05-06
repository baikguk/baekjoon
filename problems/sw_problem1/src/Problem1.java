import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

    static boolean checkList(ArrayList<Character> souvenir,char c){
        if(souvenir.contains(c)){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int i=1;
        do {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int x = 0;
            int y = 0;
            String[] map = new String[r];
            ArrayList<Character> souvenir = new ArrayList<>();
            for(int j=0;j<r;j++){
                map[j]= sc.next();
            }
            souvenir.add(map[0].charAt(0));
            for(x=0;x<r;x++){
                for(y=0;y<c;y++){
                    if(x==0&&y==0){
                        continue;
                    }
                    else if(checkList(souvenir,map[x].charAt(y))){
                        break;
                    }else
                        souvenir.add(map[x].charAt(y));
                }
            }

            System.out.println("#"+i+" "+ souvenir.size());
            i++;
        }while (i<=t);
    }
}


