import java.util.Scanner;

public class B_2750 {

    public static void swap(int[] a, int idx1, int idx2){
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }
    public static void sort(int[] a, int n){

        for(int j =0;j<n;j++) {
            int min = j;
            for (int i = j; i < n; i++) {
                if (a[min] > a[i]) {
                    min = i;
                }
            }
            if(a[min]<a[j])
                swap(a, min, j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sort(a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
