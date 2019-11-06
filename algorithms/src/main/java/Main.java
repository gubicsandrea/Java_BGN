import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 9, 11, 9, 32);
        int sumOfNumbers = sum(numbers);
        System.out.println("Összeg: " + sumOfNumbers);
        double averageOfNumbers = average(numbers);
        System.out.println("Átlag: " + averageOfNumbers);
        int countOfEvens = countEvens(numbers);
        System.out.println("Párosak száma: " + countOfEvens);
        if (containsGreaterThan100(numbers)) {
            System.out.println("Van benne 100-nál nagyobb");
        } else {
            System.out.println("Nincs benne 100-nál nagyobb");
        }
        if (isAllGreaterThan50(numbers)) {
            System.out.println("Mind 50-nél nagyobb");
        } else {
            System.out.println("Nem mind nagyobb 50-nél");
        }
        Integer negative = firstNegativ(numbers);
        if(negative == null) {
            System.out.println("Nincs negatív");
        } else {
            System.out.println("Első negatív: " + negative);
        }
    }

    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum = sum + element;
        }
        return sum;
    }

    public static double average(List<Integer> numbers) {
        return (double) sum(numbers) / numbers.size();
    }

    public static int countEvens(List<Integer> numbers) {
        int count = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean containsGreaterThan100(List<Integer> numbers) {
        boolean found = false;
        for (int element : numbers) {
            if (element > 100) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean isAllGreaterThan50(List<Integer> numbers) {
        boolean all = true;
        for (int element : numbers) {
            if (element <= 50) {
                all = false;
                break;
            }
        }
        return all;
    }

    public static Integer firstNegativ(List<Integer> numbers) {
        //TODO: implement linear search
        Integer found = null;
        for(Integer element: numbers) {
            if(element < 0) {
                found = element;
                break;
            }
        }
        return found;
    }
}
