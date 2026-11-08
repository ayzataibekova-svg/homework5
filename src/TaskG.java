import java.util.Scanner;
public class TaskG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        for (int i=0; i<n; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i<n/2; i++) {
            int t = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}