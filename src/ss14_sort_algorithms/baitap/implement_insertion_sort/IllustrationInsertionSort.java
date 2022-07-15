package ss14_sort_algorithms.baitap.implement_insertion_sort;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        int[] arrayInteger = {1,8,4,6,19,21,13,14,77};
        IllustrationInsertionSort.insertionSort(arrayInteger);
        for (Integer i : arrayInteger) {
            System.out.print(i + "   ");
        }

    }
    public static void insertionSort(int[] array) {
        for (int i=1 ; i<array.length ; i++) {
            int minValue = array[i];
            int minIndex = i;
            while (minIndex > 0 && minValue < array[minIndex-1]) {
                array[minIndex] = array[minIndex-1];
                minIndex--;
            }
            array[minIndex] = minValue;
        }
    }
}
