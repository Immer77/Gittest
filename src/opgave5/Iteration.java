package opgave5;

import java.util.List;
import java.util.ListIterator;

public class Iteration {

    public static int countDelStreng(List<String> list, String sub) {
        int count = 0;
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            count += substringCounter(iterator.next(),sub);
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
