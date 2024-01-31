package CodeString;

public class PalindromString {


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
        PalindromString palindromString = new PalindromString();
        String input = "level";
        boolean isPalindrom = palindromString.checkPalindrom(input);
        if (isPalindrom) {
            System.out.println("String is palindrom");
        } else {
            System.out.println("String is not palindrom");
        }
    }
}
