package selection;

public class MonthName {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Nincs elég paraméter");
        } else {
            MonthName monthName = new MonthName();
            monthName.writeMonthName(args[0]);
            monthName.writeSeasonName(args[0]);
        }
    }

    private void writeMonthName(String number) {
        switch (number) {
            case "1":
                System.out.println("január");
                break;
            case "2":
                System.out.println("február");
                break;
            case "3":
                System.out.println("március");
                break;
            case "4":
                System.out.println("április");
                break;
            case "5":
                System.out.println("május");
                break;
            case "6":
                System.out.println("június");
                break;
            case "7":
                System.out.println("július");
                break;
            case "8":
                System.out.println("augusztus");
                break;
            case "9":
                System.out.println("szeptember");
                break;
            case "10":
                System.out.println("október");
                break;
            case "11":
                System.out.println("november");
                break;
            case "12":
                System.out.println("december");
                break;
            default:
                System.out.println("A megadott szám nem lehet hónap sorszáma");
                break;
        }
    }

    private void writeSeasonName(String number) {
        switch (number) {
            case "1":
            case "2":
            case "12":
                System.out.println("tél");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("tavasz");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("nyár");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("ősz");
                break;
            default:
                System.out.println("A megadott szám nem lehet hónap sorszáma");
                break;
        }
    }
}
