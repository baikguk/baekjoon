import java.io.*;
//병합정렬 리뷰
public class Main {
    static int[] buff;

    static void __mergeSort(int[] a, int left, int right){
        if(left<right){
            int i;
            int center = (left+right)/2;
            int p =0;
            int j =0;
            int k=left;

            __mergeSort(a,left,center);
            __mergeSort(a,center+1,right);

            for(i=left;i<=center;i++){
                buff[p++] = a[i];
            }
            while(i<=right&&j<p){
                a[k++] = (a[i]>=buff[j])? buff[j++]:a[i++];
            }
            while(j<p){
                a[k++] = buff[j++];
            }
        }
    }
    static void mergeSort(int[] a, int n){
        buff = new int[n];
        __mergeSort(a,0,n-1);

        buff=null;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a= new int[n];

        for(int i =0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        mergeSort(a,n);

        for(int i =0;i<n;i++){
            bw.write(a[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
