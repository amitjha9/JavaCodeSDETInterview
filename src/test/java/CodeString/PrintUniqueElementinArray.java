package CodeString;

public class PrintUniqueElementinArray {

    public int getSolution(int a[]) {
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[a.length - 1];
        System.out.println("Temp:" +temp[0] + " And:" +temp[1]);
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 2};
        PrintUniqueElementinArray printUniqueElementinArray = new PrintUniqueElementinArray();
        int n = printUniqueElementinArray.getSolution(a);
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }
}

