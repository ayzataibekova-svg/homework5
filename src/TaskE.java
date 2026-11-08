import java.util.Scanner;
public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        for (int i=0; i<n; i++) {
            a[i]=in.nextInt();
        }
        boolean ff= false;
        for (int i=0; i<n-1; i++) {
            if (a[i]>0 && a[i+1]>0 || a[i]<0 && a[i+1]<0) {
                ff=true;
            }
        }
        if (ff) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}