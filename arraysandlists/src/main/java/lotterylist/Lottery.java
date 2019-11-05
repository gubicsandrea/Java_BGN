package lotterylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int drawCount;

        System.out.println("Hányas lottót szeretnél játszani?");
        drawCount = scanner.nextInt();

        int maxNumber;
        if (drawCount == 5) {
            maxNumber = 90;
        } else {
            maxNumber = 45;
        }

        List<Integer> tips = drawNumbers(drawCount, maxNumber);

        System.out.println(tips);
    }

    public static List<Integer> drawNumbers(int count, int maxNumber) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (numbers.size() < count) {
            System.out.println("Add meg az " + (i + 1) + ". számot:");
            int temp = scanner.nextInt();
            if (temp >= 1 && temp <= maxNumber && !numbers.contains(temp)) {
                numbers.add(temp);
                i++;
            }
        }

        return numbers;
    }
}
