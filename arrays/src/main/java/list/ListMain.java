package list;

import java.util.ArrayList;

public class ListMain {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(12);
        numberList.add(-3);

        int result = sumList(numberList);
        System.out.println(result);
        System.out.println(numberList);
    }

    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;
//        for(int element: list) {
//            sum += element;
//        }
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
