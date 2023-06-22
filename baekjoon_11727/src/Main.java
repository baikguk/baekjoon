import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Integer[] result_arr = new Integer[1000];

    static public int calc(int n) {
        if(n==0){
            result_arr[0] = 0;
        } else if (n == 1) {
            result_arr[1] = 1;
        }else if(n==2){
            result_arr[2] =3;
        }else {
            if(result_arr[n] == null){
                result_arr[n] = calc(n-1) + calc(n-2);
            }else{

            }

        }
        return result_arr[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        }
        System.out.println(result_arr[n]%10007);
    }


}
