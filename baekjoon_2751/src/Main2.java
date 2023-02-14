import java.io.*;

public class Main2 {
    static class Stack{
        int capacity;
        int ptr;
        int[] stk;

        public static class EmptyStackException extends RuntimeException{
            EmptyStackException(){};
        }
        public static class OverflowStackException extends RuntimeException{
            OverflowStackException(){};
        }
        Stack(int capacity){
            this.capacity = capacity;
            ptr = 0;
            try{
                stk = new int[this.capacity];
            }catch (OutOfMemoryError e){
                capacity = 0;
            }
        }
        public void push(int x) throws OverflowStackException{
            if(ptr>=capacity){
                throw new OverflowStackException();
            }else
                stk[ptr++] =x;
            }
        public int pop() throws EmptyStackException{
            if(ptr<=0){
                throw new EmptyStackException();
            }else
                return stk[--ptr];
        }
        public boolean isEmpty(){
            return ptr<=0;
        }
    }
    static void swap(int[] a,int idx1, int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static int sort3elem(int x[],int a, int b, int c){
        if(x[a]>x[b]) swap(x,a,b);
        if(x[b]>x[c]) swap(x,b,c);
        if(x[a]>x[b]) swap(x,a,b);
        return b;
    }

    static void quickSort(int[] a, int left, int right){
        Stack lstk = new Stack(right-left-1);
        Stack rstk = new Stack(right-left-1);

        lstk.push(left);
        rstk.push(right);

        while(!lstk.isEmpty()){
            int pl = left = lstk.pop();
            int pr = right = rstk.pop();
            int m =  sort3elem(a,pl,(pl+pr)/2, pr);
            int x = a[m];
            swap(a,m,right-1);

            pl++;
            pr--;
            do{
                while(a[pl]<x) pl++;
                while(x<a[pr]) pr--;

                if(pl<=pr){
                    swap(a,pl++,pr--);
                }
            }while(pl<=pr);

            if(left<pr){
                lstk.push(left);
                rstk.push(pr);
            }
            if(pl<right){
                lstk.push(pl);
                rstk.push(right);
            }
        }

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
        quickSort(a,0,n-1);

        for(int i =0;i<n;i++){
            bw.write(a[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
