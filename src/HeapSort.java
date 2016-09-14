/**
 * Created by alisa on 15.10.2015.
 */
public class HeapSort {
  private static int N;

  public static int[] HeapS(int[] arr) {
    sort(arr);
    return arr;
  }

  public static void sort(int arr[]) {
    heapify(arr);
    for (int i = N; i > 0; i--) {
      swap(arr, 0, i);
      N = N - 1;
      deletemin(arr, 0);
    }
  }

  /* Function to build a heap */
  public static void heapify(int arr[]) {
    N = arr.length - 1;
    for (int i = N / 2; i >= 0; i--)
      deletemin(arr, i);
  }

  public static void swap(int arr[], int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  /* Function to swap largest element in heap */
  public static void deletemin(int arr[], int i) {
    int left = 2 * i;
    int right = 2 * i + 1;
    int max = i;
    if (left <= N && arr[left] > arr[i])
      max = left;
    if (right <= N && arr[right] > arr[max])
      max = right;

    if (max != i) {
      swap(arr, i, max);
      deletemin(arr, max);
    }
  }
  /* Function to swap two numbers in an array */

}
