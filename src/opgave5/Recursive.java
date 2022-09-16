package opgave5;

import java.util.List;

public class Recursive {

    /**
     * Tæller forekomster af en substreng i en liste, på en rekursiv måde
     * @param list Listen som søges i
     * @param sub substrengen der søges efter
     * @return antal forekomster af substrengen i listen
     */
    public static int countDelStreng(List<String> list, String sub) {

        return countSubHelper(list,sub,0);
    }

    /**
     * Hjælpemetode som tæller forekomster af en substreng i en del af listen med strings
     * @param list Listen som der søges i
     * @param sub substrengen der søges efter
     * @param start Startindex for den del af listen som endnu ikke er søgt igennem
     * @return antal af forekomster i denne del af listen
     */
    private static int countSubHelper (List<String> list, String sub, int start) {
        int count = 0;

        count += substringCounter(list.get(0), sub);
        if (start != list.size()-1) {
            count += countSubHelper(list, sub, start+1);
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
