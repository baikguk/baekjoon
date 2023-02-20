import java.io.*;

public class Main {
    static int[] buff;
    static void __mergeSort(int[] a, int left, int right){
        if(left<right) {
           int center = (left + right) / 2;
           int i;
           int j = 0;
           int p = 0;
           int k =left;

            __mergeSort(a, left, center);
            __mergeSort(a, center + 1, right);

           for (i = left; i <= center; i++) {
               buff[p++] = a[i];
           }
           while(j<p && i<=right) {
               a[k++] = (buff[j] >= a[i]) ? a[i++] : buff[j++];
           }

           while (j < p) {
               a[k++] = buff[j++];
           }

       }
    }

    static void mergeSort(int[] a){
        buff = new int[a.length];
        __mergeSort(a,0,a.length-1);
        buff=null;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        mergeSort(a);

        for(int i=0;i<n;i++){
           bw.write(a[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
