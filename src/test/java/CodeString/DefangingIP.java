package CodeString;

public class DefangingIP {

    /*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

    A defanged IP address replaces every period "." with "[.]".
     */

    public String getSolution(String input)
    {
        String output = "";
        String data[] = input.split("\\.");
        boolean isInvalidLengthFound = false;
        String last = data[data.length-1];
        if(last.length()>3)
        {
            System.out.println("Sorry found invalid input length");
            return "-1";
        }
        for(int i=0; i<data.length-1; i++)
        {
            boolean isLengthFine = checkLength(data[i]);
            if(isLengthFine)
            {
                output = output+data[i]+"[.]";
            }
            else
            {
                isInvalidLengthFound = true;
                System.out.println("Sorry found invalid input length");
                output = "";
                break;
            }
        }
        if(isInvalidLengthFound)
        {
            last = "-1";
            return last;
        }
        return  output+last;
    }

    public boolean checkLength(String in)
    {
        boolean flag = true;
        if(in.length()>3)
        {
            flag = false;
        }
        return flag;
    }


    public static void main(String[] args)
    {
        String input = "255.100.150.100";
        DefangingIP defangingIP = new DefangingIP();
        String output = defangingIP.getSolution(input);
        System.out.println("Output:" +output);
    }
}
