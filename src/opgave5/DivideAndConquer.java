package opgave5;

import java.util.List;

public class DivideAndConquer {

    /**
     * tæller forekomster af substrenge i en liste, ved brug af Divide & Conquer metoden
     * @param list Listen som søges i
     * @param sub substrengen som skal tælles
     * @return antal forekomster af substrengen i listen
     */
    public static int countDelStreng(List<String> list, String sub) {
        //Kalder hjælpemetoden med start og slutindex for hele listen
        return countSubHelper(list, sub,0,list.size()-1);

    }

    /**
     * Hjælpemetode som tæller forekomster af substrenge i en del af en liste, ved brug af Divide & Conquer metoden
     * @param list Listen som søges i
     * @param sub substrengen som skal tælles
     * @param start første index af en mindre del af den originale liste
     * @param end sidste index af en mindre del af den originale liste
     * @return Antallet af substrengen i den del af listen der søges efter
     */
    private static int countSubHelper (List<String> list, String sub, int start, int end) {
        //Tæller antal forekomster af substrengen
        int count = 0;
        //Beregner midten af den markerede del af listen
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
