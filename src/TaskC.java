import java.util.Scanner;
public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // all values are 0

        for (int i=0;i<n;i++) {
            numbers[i] = scanner.nextInt();
        }
        int a =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>0){
                a++;
            }
        }
        System.out.print(a);
    }
}