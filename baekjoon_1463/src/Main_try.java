import java.io.IOException;
import java.util.Scanner;

public class Main_try {

    static boolean check_except(int x) {
        return ((double) x -1)/3 % 3 == 0.0 || ((double) x -2)/3 % 3 == 0.0;

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;

        while(x!=1){
            if(x==0){
                throw new IOException();
            }
            if(Main_try.check_except(x)) {
                x -= 1;
                count++;
            }else if (x % 3 == 0) {
                x /= 3;
                count++;
            } else if (x % 2 == 0) {
                x /= 2;
                count++;
            } else {
                x -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
