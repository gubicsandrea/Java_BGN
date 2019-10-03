package array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 8, 10};

        int[][] matrix = {{2, 3}, {1, 2, 3}, {7}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        matrix = new int[4][];
//        numbers = new int[5];
//        numbers[4] = 10;

//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] = 20;
//        }

//        for(int x: numbers) {
//            x = 20;
//        }
//
        printIntArray(numbers);
//
        String[] words = {"alma", "körte", "barack"};
        words = new String[3];

//        for (int i = 0; i < words.length; i++) {
//            words[i] = "szilva";
//        }


        //printStringArray(words);
    }

    private static void printIntArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printStringArray(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
