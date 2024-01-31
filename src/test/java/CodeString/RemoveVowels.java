package CodeString;

public class RemoveVowels {

    public String getSolution(String input) {
        input = input.toUpperCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U')
            {

            }
            else
            {
                output = output +input.charAt(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String test = "Amitkumerojha";
        RemoveVowels removeVowels = new RemoveVowels();
        String result = removeVowels.getSolution(test);
        System.out.println("OutPut is:" + result);
    }
}
