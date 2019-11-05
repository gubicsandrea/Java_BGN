package lottery;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        int[] tips = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tips.length; i++) {
            boolean contains;
            do {
                System.out.println("Add meg a(z) " + (i + 1) + ". számot:");
                tips[i] = scanner.nextInt();
                contains = contains(Arrays.copyOf(tips, i), tips[i]);
            } while (tips[i] < 1 || tips[i] > 90 || contains);

        }

        Arrays.sort(tips);
        System.out.println(Arrays.toString(tips));
    }

    public static boolean contains(int[] array, int number) {
        boolean contains = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
