import java.util.Scanner;

public class Main {
    static int median(int a,int b,int c){
        if(b>=a){
            return c>=b?b:(a>=c)?a:c;
        }else {
            return c>a?a:(b>c)?b:c;
        }

    }

    public static void main(String[] args) {
        int a, b, c;
        int[]  n = new int[3];
        Scanner sc = new Scanner(System.in);
        do{
             a = sc.nextInt();
             b =sc.nextInt();
             c =sc.nextInt();

        }while(a<1 || a>100||b<1 || b>100||c<1 || c>100);

        System.out.println(median(a,b,c));
    }
}
