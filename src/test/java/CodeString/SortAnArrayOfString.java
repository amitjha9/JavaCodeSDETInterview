package CodeString;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayOfString {

    public void getSolution() {
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i].compareTo(countries[j]) > 0) {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
    }


    public void getSolutionDecending() {
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i].compareTo(countries[j]) > 0) {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        Arrays.sort(countries, Collections.reverseOrder());
        System.out.println(Arrays.toString(countries));
    }

    public void test()
    {
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries,Collections.reverseOrder());
        System.out.println(Arrays.toString(countries));
    }

    public static void main(String[] args) {
        SortAnArrayOfString sortAnArrayOfString = new SortAnArrayOfString();
        //sortAnArrayOfString.getSolution();
        //sortAnArrayOfString.getSolutionDecending();
        sortAnArrayOfString.test();
    }
}
