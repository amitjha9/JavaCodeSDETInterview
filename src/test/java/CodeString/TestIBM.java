package CodeString;

public class TestIBM {

    //String test = "Hi my name is amit kumar jha, today is my interview date";

    public void getSolution(String input)
    {
        String str[] = input.split(",");
        for(int i=0; i<str.length; i++)
        {
            String testIn = str[i];
            getOutput(testIn);
        }
    }

    public void getOutput(String in)
    {
        int minLength = 0;
        String maxString = "";
        String minString = "";
        String dataInput[] = in.split(" ");
        for(int i=0; i<dataInput.length-1; i++)
        {
            for(int j=i+1; j<dataInput.length; j++)
            {
                maxString = dataInput[i];
                minString = dataInput[i];

                if(maxString.length()<dataInput[j].length() && minString.length()<maxString.length() )
                {
                    maxString = dataInput[j];
                    minString = dataInput[j];
                }
            }
        }

        System.out.println("Max String is:" +maxString);
        System.out.println("Min String is:" +minString);
    }

    public static void main(String[] args)
    {
        String test = "hi my name is amit kumar jha, today is my interview date";
        TestIBM testIBM = new TestIBM();
        testIBM.getSolution(test);
    }
}
