package CodeString;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {


    public void getSumOfDigitsFromString(String input)
    {
        char ch[] = input.toCharArray();
        int sum = 0;
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                int value = Character.getNumericValue(ch[i]);
                sum = sum +value;
            }
        }

        System.out.println("Total Sum is:" +sum);
    }

    public int getNumericSum(String input)
    {
        char ch[] = input.toCharArray();
        String data = "0";
        int sum = 0;
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                data = data+ch[i];
            }
            else {
                sum = sum + Integer.parseInt(data);
                data = "0";
            }
        }
        return sum+Integer.parseInt(data);
    }


    public static void main(String[] args)
    {
        String input = "amit1990ku203jha87";
        SumOfDigits sumOfDigits = new SumOfDigits();
        //sumOfDigits.getSumOfDigitsFromString(input);
        int output = sumOfDigits.getNumericSum(input);
        System.out.println("Output:" +output);
    }
}
