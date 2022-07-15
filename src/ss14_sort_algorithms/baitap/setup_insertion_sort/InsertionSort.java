package ss14_sort_algorithms.baitap.setup_insertion_sort;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i=1 ; i<array.length ; i++) {
            int minValue = array[i];
            int index = i;
            while (index > 0 && minValue<array[index-1]) {
                array[index] = array[index-1];
                index--;
            }
            array[index] = minValue;
        }
        for (Integer i : array) {
            System.out.print(i + "   ");
        }
    }
}
