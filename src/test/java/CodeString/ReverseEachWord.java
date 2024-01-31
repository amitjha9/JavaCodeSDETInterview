package CodeString;

public class ReverseEachWord {


    public String reverseEachWord(String input) {
        String value[] = input.split(" ");
        String outPut = "";
        for (int i = 0; i < value.length; i++) {
            String word = value[i];
            String reverseValue = reverseWord(word);
            outPut = outPut+" " +reverseValue;
        }
        return outPut;
    }

    public String reverseWord(String word) {
        char ch[] = word.toCharArray();
        String reverse = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseEachWord reverseEachWord = new ReverseEachWord();
        String input = "welcome amit jha";
        String result = reverseEachWord.reverseEachWord(input);
        System.out.println("Result is:" + result);
    }
}
