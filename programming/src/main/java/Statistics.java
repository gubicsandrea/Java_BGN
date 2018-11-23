import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Statistics {

    private int[] numbers;

    public Statistics(int[] numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int sum1 = 0;
        for (int element: numbers) {
            sum1 += element;
        }
        return sum1;
    }

    public double average() {
        int sum1 = sum();
        return (double) sum1 / numbers.length;
    }

    public int countEvens() {
        int count = 0;
        for (int element: numbers) {
            if(element % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean hasGreaterThan100() {
        boolean has = false;
        for(int number: numbers) {
            if(number > 100) {
                has = true;
                break;
            }
        }
        return has;
    }

    public boolean allGreaterThan100() {
        boolean all = true;
        for(int i: numbers) {
            if(i <= 100) {
                all = false;
                break;
            }
        }
        return all;
    }

    public Integer searchFor() {
        Integer result = null;
        for(int num: numbers) {
            if(num < 0) {
                result = num;
                break;
            }
        }
        return result;
    }

    public List<Integer> searchForAll() {
        List<Integer> result = new ArrayList<>();
        for(int num: numbers) {
            if(num < 0) {
                result.add(num);
            }
        }
        return result;
    }
}
