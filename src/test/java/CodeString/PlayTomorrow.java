package CodeString;

public class PlayTomorrow {

    public void getSolution(String input)
    {
        int count = 0;
        String output = "";
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='o')
            {
                count++;
                for(int k=0; k<count; k++)
                {
                    output = output+"#";
                }
            }
            else
            {
                output = output+ch[i];
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args)
    {
        String input = "tomorrow";
        PlayTomorrow playTomorrow = new PlayTomorrow();
        playTomorrow.getSolution(input);
    }
}
