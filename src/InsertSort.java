import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Timer;

public class InsertSort {


    public static void swap(int @NotNull [] array, int prev, int next) {
        int temp = array[next];
        array[next] = array[prev];
        array[prev] = temp;
    }

    public static void insertSort(int @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            int minInd = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            swap(array, i, minInd);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,4,9,5,3,2};

        long startTime = System.nanoTime();
        insertSort(array);
        long endTime = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
