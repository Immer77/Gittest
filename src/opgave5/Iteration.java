package opgave5;

import java.util.List;
import java.util.ListIterator;

public class Iteration {

    /**
     * Tæller forekomster af en substreng i en liste på en Iterativ måde
     * @param list en liste med strenge
     * @param sub substrengen der skal tælles
     * @return antal forekomster af substrengen
     */
    public static int countDelStreng(List<String> list, String sub) {
        int count = 0;
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            count += substringCounter(iterator.next(),sub);
        }
        return count;
    }

    /**
     * Tæller antal gange den inputtede substring forekommer i en string
     * @param string Den string der skal søges i
     * @param sub Den substring der søges efter
     * @return antallet af forekomster
     */
    private static int substringCounter (String string, String sub) {
        int count = 0;
        int stringLength = string.length();
        int subLength = sub.length();
        //Index for strengen
        int index = 0;

        //Så længe der er karakterer nok tilbage i strengen til at substrengen kan forekomme....
        while (stringLength - (subLength +index) > 0) {
            //Tjek om substrengen forekommer på det pågældende index
            if (string.substring(index, subLength+index).equalsIgnoreCase(sub)) {
                count++;
            }
            //Tæl index op
            index++;
        }
        return count;
    }
}
