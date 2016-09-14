
/**
 * Created by alisa on 15.10.2015.
 */
public class MergeSort {

  private int[] array;
  private int[] tempMergArr;
  private int length;

  public static int[] Mmerge(int arr[]) {
    MergeSort mms = new MergeSort();
    mms.sort(arr);
    return arr;
  }

  public void sort(int inputArr[]) {
    this.array = inputArr;
    this.length = inputArr.length;
    this.tempMergArr = new int[length];
    MergeS(0, length - 1);
  }

  private void MergeS(int lowerIndex, int higherIndex) {

    if (lowerIndex < higherIndex) {
      int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
      // Below step sorts the left side of the array
      MergeS(lowerIndex, middle);
      // Below step sorts the right side of the array
      MergeS(middle + 1, higherIndex);
      // Now merge both sides
      mergeParts(lowerIndex, middle, higherIndex);
    }
  }

  private void mergeParts(int lowerIndex, int middle, int higherIndex) {

    for (int i = lowerIndex; i <= higherIndex; i++) {
      tempMergArr[i] = array[i];
    }
    int i = lowerIndex;
    int j = middle + 1;
    int k = lowerIndex;
    while (i <= middle && j <= higherIndex) {
      if (tempMergArr[i] <= tempMergArr[j]) {
        array[k] = tempMergArr[i];
        i++;
      } else {
        array[k] = tempMergArr[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      array[k] = tempMergArr[i];
      k++;
      i++;
    }

  }

}
