import java.util.ArrayList;
import java.util.List;

public class StringMain {

    public static void main(String[] args) {
        List<String> fruits = List.of("alma", "körte", "Ananász", "Barack");

        String shortest = shortestWord(fruits);
        System.out.println(shortest);

        String longest = longestWord(fruits);
        System.out.println(longest);

        List<String> wordsWithA = startsWithA(fruits);
        System.out.println(wordsWithA);

    }

    public static String shortestWord(List<String> words) {
        String min = words.get(0);
        for (String element: words) {
            if(element.length() < min.length()) {
                min = element;
            }
        }
        return min;
    }

    public static String longestWord(List<String> words) {
        String max = words.get(0);
        for (String element: words) {
            if(element.length() > max.length()) {
                max = element;
            }
        }
        return max;
    }

    public static List<String> startsWithA(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word: words) {
            if(word.toLowerCase().startsWith("a")) {
                result.add(word);
            }
        }
        return result;
    }
}
