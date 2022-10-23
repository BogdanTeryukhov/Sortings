import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int @NotNull []array, int prev, int next){
        int temp = array[next];
        array[next] = array[prev];
        array[prev] = temp;
    }

    public static void bubbleSort(int @NotNull [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,4,9,5,3,2};

        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
