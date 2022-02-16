class BubbleSort{
    public static int[] bubbleSort(int arr[]) {
        int n = arr.length, x, y, z;
        for (x = 0; x < n; x++) {
            for (y = x + 1; y < n; y++) {
                if (arr[y] < arr[x]) {
                    z = arr[x];
                    arr[x] = arr[y];
                    arr[y] = z;
                }
            }
        }
        return arr ;
    }
    public static void printArray(int arr[])
    {
        int i,size = arr.length;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] +  " ");
    }
}

public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int[] b = BubbleSort.bubbleSort(arr);
        BubbleSort.printArray(b);
    }
}