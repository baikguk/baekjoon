import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String s = br.readLine();
        int sum=0;
        int total=0;
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(s.split(" ")[i]);
        }
        br.close();

        Arrays.sort(a);
        for(int i =0;i<a.length;i++){
            sum+=a[i];
            total+=sum;
        }
        bw.write(total+"\n");
        bw.flush();
        bw.close();
    }
}
