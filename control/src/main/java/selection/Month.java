package selection;

public class Month {

    public String monthName(int numberOfMonth) {
        if (numberOfMonth == 1) {
            return "Január";
        }
        if (numberOfMonth == 2) {
            return "Február";
        }
        if (numberOfMonth == 3) {
            return "Március";
        }
        if (numberOfMonth == 4) {
            return "Április";
        }
        if (numberOfMonth == 5) {
            return "Május";
        }
        if (numberOfMonth == 6) {
            return "Június";
        }
        if (numberOfMonth == 7) {
            return "Július";
        }
        if (numberOfMonth == 8) {
            return "Augusztus";
        }
        if (numberOfMonth == 9) {
            return "Szeptember";
        }
        if (numberOfMonth == 10) {
            return "Október";
        }
        if (numberOfMonth == 11) {
            return "November";
        }
        if (numberOfMonth == 12) {
            return "December";
        }
        return "Nem hónapsorszám";
    }

    public String monthNameWithSwitch(int numberOfMonth) {
        String result;
        switch (numberOfMonth) {
            case 1:
                result = "Január";
                break;
            case 2:
                result = "Február";
                break;
            case 3:
                result = "Március";
                break;
            case 4:
                result = "Április";
                break;
            case 5:
                result = "Május";
            case 6:
                result = "Június";
                break;
            case 7:
                result = "Július";
                break;
            case 8:
                result = "Augusztus";
                break;
            case 9:
                result = "Szeptember";
                break;
            case 10:
                result = "Október";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Nem hónapsorszám";
        }
        return result;
    }

    public String seasonByNumberOfMonth(int numberOfMonth) {
        String result;
        switch (numberOfMonth) {
            case 12:
            case 1:
            case 2:
                result = "Tél";
                break;
            case 3:
            case 4:
            case 5:
                result = "Tavasz";
                break;
            case 6:
            case 7:
            case 8:
                result = "Nyár";
                break;
            case 9:
            case 10:
            case 11:
                result = "Ősz";
                break;
            default:
                result = "Nem hónapsorszám";
        }
        return result;
    }
}
