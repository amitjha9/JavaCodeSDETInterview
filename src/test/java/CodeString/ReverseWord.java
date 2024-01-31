package CodeString;

public class ReverseWord {


    public void reverseWord(String input) {
        char ch[] = input.toCharArray();
        String reverse = "";
        for (int i = ch.length-1; i >=0; i--) {
           reverse = reverse+ch[i];
        }

        System.out.println("Reverse String is:" +reverse);
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        String input = "Amit";
        reverseWord.reverseWord(input.toUpperCase());
    }
}
