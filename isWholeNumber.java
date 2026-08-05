package UtilityClasses;

public class isWholeNumber {
    public static boolean check(String a) {
        char ch;
        int f;
        a = a.trim();
        if (a.equals(""))
            return false;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            f = (int) ch;
            if (f < 48 || f > 57)
                return false;
        }

        return true;
    }

}
