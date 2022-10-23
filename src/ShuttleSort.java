import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ShuttleSort {

    public static void swap(int @NotNull [] array, int prev, int next) {
        int temp = array[next];
        array[next] = array[prev];
        array[prev] = temp;
    }

    public static void shuttleSort(int @NotNull [] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]){
                swap(array, i - 1, i);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z - 1, z);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,4,9,5,3,2};

        long startTime = System.nanoTime();
        shuttleSort(array);
        long endTime = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
