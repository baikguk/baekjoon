import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class Main {


    public static void main(String[] args) throws IOException {
        int[] rect_case = new int[1001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result;
        rect_case[0] = 0;
        rect_case[1] = 1;
        rect_case[2] = 2;
        rect_case[3] = 3;
        for (int i = 4; i <= 1000; i++) {
            rect_case[i] = (rect_case[i - 1] + rect_case[i - 2])%10007;
        }
        System.out.println(rect_case[n]);
    }
}

//    static Integer find_case(int n) {
//        if(n>3) {
//                rect_case[n] = find_case(n - 1) + find_case(n - 2);
//        }
//        return rect_case[n];
//    }
