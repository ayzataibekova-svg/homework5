import java.awt.*;
import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        for (int i=0; i<n; i++) {
            a[i]=in.nextInt();
        }
        int b=in.nextInt();
        for (int i=1; i<n-1; i++) {
            if (a[i]>a[i-1] && a[i]>a[i+1]) {
                b++;
            }
        }
        System.out.println(b);
    }
}