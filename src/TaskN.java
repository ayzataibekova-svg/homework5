import java.util.Scanner;
public class TaskN{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        for (int i=0; i<n; i++) {
            a[i]=in.nextInt();
        }
        int k = in.nextInt();
        k = ((k % n) + n) % n;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = a[i];
            a[i] = a[k - 1 - i];
            a[k - 1 - i] = temp;
        }
        for (int i = 0; i < (n - k) / 2; i++) {
            int temp = a[k + i];
            a[k + i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}