package CodeString;

import java.util.ArrayList;
import java.util.List;

public class FindPalindromicWord {


    public void findWords(String input) {
        List<String> word = new ArrayList<>();
        String val[] = input.split(" ");
        for (int i = 0; i < val.length; i++) {
            boolean isPalindrom = checkPalindrom(val[i]);
            if (isPalindrom) {
                word.add(val[i]);
            }
        }

        System.out.println("List is:" + word);
    }

    public boolean checkPalindrom(String input) {
        boolean flag = false;
        char ch[] = input.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }

        if (rev.equalsIgnoreCase(input)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        FindPalindromicWord findPalindromicWord = new FindPalindromicWord();
        String input = "level is just a matter of 121 radar";
        findPalindromicWord.findWords(input);
    }
}
