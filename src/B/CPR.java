package B;

public class CPR {
    public static boolean isCPRValid(String cpr){
        int day = Integer.parseInt(cpr.substring(0, 2));
        int year = Integer.parseInt(cpr.substring(4, 6));

        if (cpr.length() != 10){
            return false;
        }
        if (day > 31){
            return false;
        }
        if (year > 12){
            return false;
        }
        else {
            return true;
        }

    }
}
