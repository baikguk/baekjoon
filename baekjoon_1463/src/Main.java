import java.io.*;
import java.util.Scanner;

public class Main {
    static Integer[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        br.close();
        result = new Integer[x+1];
        result[0] =result[1]=0;
        for (int i = 1; i <= x; i++)
            calc(i);
        int calc_result = calc(x);
        bw.write(calc_result+"\n");
        bw.flush();
        bw.close();
    }

    static int calc(int x) {

        if(result[x]==null){
            if(x%6==0) {
                result[x] = Math.min(calc(x - 1),Math.min(calc(x/3),calc(x/2)))+1;
            }else if(x%3==0){
                result[x] =  Math.min(calc(x/3),calc(x-1))+1;
            }else if(x%2==0){
                result[x] = Math.min(calc(x/2),calc(x-1))+1;
            }else
                result[x] = calc(x-1) +1;
        }
    return result[x];

    }
}
