import java.util.Timer;

/**
 * Created by alisa on 14.10.2015.
 */
public class Source {
    public static void main(String[] args) {

        final int[] sorted = new int[10000];
        final int[] revsorted = new int[10000];

        for (int i = 0; i < 10000; i++) {
            sorted[i] = i;
        }
        for (int i = 0; i < 10000; i++) {
            revsorted[i] = 10000 - i;
        }
        final int[] randomsorted = RandomGen.RandomizeArray(sorted);


        ////////////////////////////////////////////////
        //Sorted , reverse sorted and random numbers created.
        ////////////////////////////////////////////////
       long InsSortedStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = InsertionSort.InsertionS(sorted);
            testarray=null;
        }
        long InsSortedEnd = System.currentTimeMillis();
        ////////////////////////////////////////////
        long InsRevStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = InsertionSort.InsertionS(revsorted);
            testarray=null;
        }
        long InsRevEnd = System.currentTimeMillis();
          ///////////////////////////////////////
        long InsRandomStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = InsertionSort.InsertionS(randomsorted);
            testarray=null;
        }
        long InsRandomEnd = System.currentTimeMillis();
        /////////////////////////////////////////



        long SelSortedStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = SelectionSort.SelectionS(sorted);
            testarray=null;
        }
        long SelSortedEnd = System.currentTimeMillis();
        /////////////////////////////////////////
        long SelRevStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = SelectionSort.SelectionS(revsorted);
            testarray=null;
        }
        long SelRevEnd = System.currentTimeMillis();
        ///////////////////////////////////
        long SelRandomStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = SelectionSort.SelectionS(randomsorted);
            testarray=null;
        }
        long SelRandomEnd = System.currentTimeMillis();
        ////////////////////////////////////


        long BubSortedStart =System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = BubbleSort.BubbleS(sorted);
            testarray=null;
        }
        long BubSortedEnd = System.currentTimeMillis();
        ////////////////////////////
        long BubRevtart =System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = BubbleSort.BubbleS(revsorted);
            testarray=null;
        }
        long BubRevEnd = System.currentTimeMillis();
        ////////////////////////////
        long BubRandomStart =System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = BubbleSort.BubbleS(randomsorted);
            testarray=null;
        }
        long BubRandomEnd = System.currentTimeMillis();
        /////////////////////////


        long MerSortedStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = MergeSort.Mmerge(sorted);
            testarray=null;
        }
        long MerSortedEnd = System.currentTimeMillis();
        ///////////////////////
        long MerSRevtart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = MergeSort.Mmerge(revsorted);
            testarray=null;
        }
        long MerRevEnd = System.currentTimeMillis();
        /////////////////////////
        long MerRandomStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = MergeSort.Mmerge(randomsorted);
            testarray=null;
        }
        long MerRandomEnd = System.currentTimeMillis();
        ///////////////////////////

        long QuiSortedStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = QuickSort.QuickS(sorted);
            testarray=null;
        }
        long QuiSortedEnd = System.currentTimeMillis();
        ////////////////////////
        long QuiRevStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = QuickSort.QuickS(revsorted);
            testarray=null;
        }
        long QuiRevdEnd = System.currentTimeMillis();
        ////////////////////////////
        long QuiRandomStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = QuickSort.QuickS(randomsorted);
            testarray=null;
        }
        long QuiRandomEnd = System.currentTimeMillis();
        ////////////////////////////////


        long HeapSortedStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = HeapSort.HeapS(sorted);
            testarray=null;
        }
        long HeapSortedEnd = System.currentTimeMillis();
        ////////////////////
        long HeapRevStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = HeapSort.HeapS(revsorted);
            testarray=null;
        }
        long HeapRevEnd = System.currentTimeMillis();
        /////////////////////////////
        long HeapRandomStart = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            int[] testarray = HeapSort.HeapS(randomsorted);
            testarray=null;
        }
        long HeapRandomEnd = System.currentTimeMillis();
        /////////////////////////

        System.out.println("Execution Times For Sorted Numbers : ");
        System.out.println("Insertion Sort = "+(InsSortedEnd-InsSortedStart)+"ms  Selection Sort = "+(SelSortedEnd-SelSortedStart)+"ms  Bubble Sort = "+(BubSortedEnd-BubSortedStart)+"ms");
        System.out.println("Merge Sort = "+(MerSortedEnd-MerSortedStart)+"ms  Quick Sort = "+(QuiSortedEnd-QuiSortedStart)+"ms  Heap Sort = "+(HeapSortedEnd-HeapSortedStart)+"ms");
        System.out.println();
        System.out.println("Execution Times For Reverse Order Numbers : ");
        System.out.println("Insertion Sort = "+(InsRevEnd-InsRevStart)+"ms  Selection Sort = "+(SelRevEnd-SelRevStart)+"ms  Bubble Sort = "+(BubRevEnd-BubRevtart)+"ms");
        System.out.println("Merge Sort = "+(MerRevEnd-MerSRevtart)+"ms  Quick Sort = "+(QuiRevdEnd-QuiRevStart)+"ms  Heap Sort = "+(HeapRevEnd-HeapRevStart)+"ms");
        System.out.println();
        System.out.println("Execution Times For Random Number : ");
        System.out.println("Insertion Sort = "+(InsRandomEnd-InsRandomStart)+"ms  Selection Sort = "+(SelRandomEnd-SelRandomStart)+"ms  Bubble Sort = "+(BubRandomEnd-BubRandomStart)+"ms");
        System.out.println("Merge Sort = "+(MerRandomEnd-MerRandomStart)+"ms  Quick Sort = "+(QuiRandomEnd-QuiRandomStart)+"ms  Heap Sort = "+(HeapRandomEnd-HeapRandomStart)+"ms");

















    }
}
