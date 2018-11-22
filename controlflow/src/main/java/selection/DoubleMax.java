package selection;

public class DoubleMax {

    public static void main(String[] args) {
        if(args.length<2) {
            System.out.println("Legalább 2 számot adj meg!");
        } else {
            double number1= Double.parseDouble(args[0]);;
            double number2 = Double.parseDouble(args[1]);
            if(number1 < number2) {
                System.out.println(number2);
            } else if(number1 > number2) {
                System.out.println(number1);
            } else {
                System.out.println("Mindkettő " + number1);
            }
        }
    }
}
