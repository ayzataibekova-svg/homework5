import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
            System.out.print( numbers[i] +" ");
        }
        System.out.println();
        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.print(max);


    }
}