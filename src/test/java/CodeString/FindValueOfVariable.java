package CodeString;

public class FindValueOfVariable {


    public int getSolution(String input[])
    {
        int result = 0;
        for(int i=0; i<input.length; i++)
        {
            if(input[i]=="++X" || input[i]=="X++")
            {
                result = result+1;
            }
            else
            {
                result = result-1;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String operations[] = {"++X","++X","X++"};
        FindValueOfVariable findValueOfVariable = new FindValueOfVariable();
        int output = findValueOfVariable.getSolution(operations);
        System.out.println("Output:" +output);
    }
}
