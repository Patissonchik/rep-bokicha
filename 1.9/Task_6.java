import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k=0;
        int t=0, i ,j, t2=1;
        int[] a;
        int N=in.nextInt();
        a=new int[N];
        for ( i = 0; i <N; i++) {
            a[i]=in.nextInt(); }
        for ( i = 0; i <N; i++) {
            for (j = 0; j <N; j++) {
                if(a[i]==a[j]){k++;} }
            if(t<k){
                t=k;
                t2=i;
            }
            k=0;
        }
        System.out.println(a[t2]);
        System.out.println("Derji, psina");
    }
}


