package CodeString;

public class SortAnArrayOfElement {

    public void getSolutionDecending()
    {
        int a[] = {13,25,12,18,44,22,27};
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

        //Array after sorting
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
    }

    public void getSolutionAssending()
    {
        int a[] = {13,25,12,18,44,22,27};
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //Array after sorting
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
    }

    public static void main(String[] args)
    {
        SortAnArrayOfElement sortAnArrayOfElement = new SortAnArrayOfElement();
        sortAnArrayOfElement.getSolutionDecending();
        System.out.println("\n");
        sortAnArrayOfElement.getSolutionAssending();
    }
}
