/**
 * Created by alisa on 14.10.2015.
 */
public class SelectionSort {
    public static int[] SelectionS(int[] input){

        for (int i = 0; i < input.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < input.length; j++)
                if (input[j] < input[index])
                    index = j;

            int smallerNumber = input[index];
            input[index] = input[i];
            input[i] = smallerNumber;
        }
        return input;
    }

}

