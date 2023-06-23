import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] result_arr = new int[n+1];
        result_arr[0] = 1;
        result_arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            result_arr[i] = (result_arr[i-1]+ 2*result_arr[i-2])%10007;
        }
        System.out.println(result_arr[n]);
    }
}
