package iteration;

public class Loops {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[1]);
        for (int i = 0; i < number; i++) {
            System.out.print(args[0]);
            if(i >= 5) {
                continue;
            }
            System.out.print("páros");
        }
    }
}
