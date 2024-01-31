package CodeString;

public class CountCharinString {


    public int result(String input)
    {
        int total = 0;
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(!Character.isWhitespace(ch[i]))
            {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args)
    {
        CountCharinString countCharinString = new CountCharinString();
        String input = "Amit";
        int total=countCharinString.result(input);
        System.out.println("Total Char is:" +total);
    }
}
