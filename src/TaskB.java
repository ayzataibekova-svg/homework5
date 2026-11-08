import java.util.Scanner;
public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // all values are 0

        for (int i=0;i<n;i++) {
            numbers[i] = scanner.nextInt();
        }
        int a =0;
        int b =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                a++;
            else {
                b++;
            }
        }
        System.out.println("even= " + a);
        System.out.println("odd= " + b);
    }
}