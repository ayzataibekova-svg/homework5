import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && a[i] == a[j]) {
                j++;
            }
            if (j - i >= 3) {
                count += j - i;
                for (int k = j; k < n; k++) {
                    a[k - (j - i)] = a[k];
                }
                n -= j - i;
                i = -1;
            }
        }
        System.out.println(count);
    }
}