package opgave5;

import java.util.List;

public class DivideAndConquer {

    public static int countDelStreng(List<String> list, String sub) {
        return countSubHelper(list, sub,0,list.size()-1);

    }

    private static int countSubHelper (List<String> list, String sub, int start, int end) {
        int count = 0;
        int middle = (start + end ) / 2;

        //Hvis der er mere end 1 element i første del af listen, del listen i to. ellers undersøg det element for substrings
        if (middle - start > 1 ) {
           count += countSubHelper(list,sub,start,middle);
        } else {
            count += substringCounter(list.get(start), sub);
        }

        //Hvis der er mere end 1 element i anden del af listen, del listen i to. ellers undersøg det element for substrings
        if (end - middle >= 1 ) {
            count += countSubHelper(list,sub,middle+1,end);
        } else {
            count += substringCounter(list.get(middle), sub);
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
