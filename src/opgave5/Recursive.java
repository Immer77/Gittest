package opgave5;

import java.util.List;

public class Recursive {

    public static int countDelStreng(List<String> list, String sub) {

        return countSubHelper(list,sub,0);
    }

    private static int countSubHelper (List<String> list, String sub, int start) {
        int count = 0;

        count += substringCounter(list.get(0), sub);
        if (start != list.size()-1) {
            count += countSubHelper(list, sub, start+1);
        }

        return count;
    }

    private static int substringCounter (String string, String sub) {
        int count = 0;
        int stringLength = string.length();
        int subLength = sub.length();
        int current = 0;

        while (stringLength - (subLength +current) > 0) {
            if (string.substring(current, subLength+current).equalsIgnoreCase(sub)) {
                count++;
            }
            current++;
        }
        return count;
    }
}
