package CodeString;

public class PrintSecondLargeNum {


    public void getSolution()
    {
        int a[] = {15,56,45,10,34};
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //After sort
        System.out.println("Second largest from array is:" +a[1]);
    }

    public static void main(String[] args)
    {
        PrintSecondLargeNum printSecondLargeNum = new PrintSecondLargeNum();
        printSecondLargeNum.getSolution();
    }
}
