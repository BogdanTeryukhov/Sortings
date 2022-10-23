import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int @NotNull [] array, int prev, int next) {
        int temp = array[next];
        array[next] = array[prev];
        array[prev] = temp;
    }

    public static void selectionSort(int @NotNull [] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = 0;
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min){
                    min = array[j];
                    index = j;
                    flag = true;
                }
            }
            if (flag)
                swap(array, i, index);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,4,9,5,3,2};

        long startTime = System.nanoTime();
        selectionSort(array);
        long endTime = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
