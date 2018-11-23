import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, -8, 23, 8, -21};

        Statistics statistics = new Statistics(array);

        int x = statistics.sum();
        double d = statistics.average();
        int count = statistics.countEvens();
        Integer neg = statistics.searchFor();
        List<Integer> negatives = statistics.searchForAll();

        System.out.println(x);
        System.out.println(d);
        System.out.println(count);
        if(neg == null) {
            System.out.println("Nincs benne negatív szám.");
        } else {
            System.out.println(neg);
        }
        System.out.println(negatives);
    }
}
