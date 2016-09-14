/**
 * Created by alisa on 14.10.2015.
 */
public class BubbleSort {
    public static int[] BubbleS(int array[]) {
        int n = array.length;
        int k;
        int temp;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;

                }
            }
        }
        return array;

    }


}
