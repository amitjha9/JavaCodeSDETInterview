package CodeString;

public class ConvertEachChartoUp {

    public String result(String input)
    {
        char ch[] = input.toCharArray();
        String output = "";
        for(int i=0; i<ch.length; i++)
        {
            if(!Character.isUpperCase(ch[i]))
            {
                char up = Character.toUpperCase(ch[i]);
                output = output+Character.toString(up);
            }
        }
        return output;
    }

    public static void main(String[] args)
    {
        ConvertEachChartoUp convertEachChartoUp = new ConvertEachChartoUp();
        String input = "amit";
        String finalOut = convertEachChartoUp.result(input);
        System.out.println("Output String:" +finalOut);
    }
}
