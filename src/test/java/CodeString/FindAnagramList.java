package CodeString;

public class FindAnagramList {


    public void findAllAnagram(String input[])
    {
        for(int i=0; i<input.length; i++)
        {
            for(int j=i+1; j<input.length; j++)
            {
                boolean isAna = checkAnangram(input[i], input[j]);
                if(isAna)
                {
                    System.out.println(input[i] + " is Anangram of " +input[j]);
                }
                else
                {
                    System.out.println(input[i] + " is not Anangram of " +input[j]);
                }
            }
        }
    }

    public boolean checkAnangram(String input1, String input2)
    {
        boolean flag = false;

        if(input1.length()!=input2.length())
        {
            return flag;
        }
        else
        {
            for(int i=0; i<input1.length(); i++)
            {
                for(int j=0; j<input2.length(); j++)
                {
                    if(input1.charAt(i)==input2.charAt(j))
                    {
                        flag = true;
                        break;
                    }
                    else {
                        flag = false;
                    }
                }

                if(flag==false)
                {
                    break;
                }
            }
        }
        return flag;
    }


    public static void main(String[] args)
    {
        String input[] = {"silent","listen","keep","peek"};

        FindAnagramList findAnagramList = new FindAnagramList();
        findAnagramList.findAllAnagram(input);
    }
}
