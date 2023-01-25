import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of
     *         arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int combinedArraySize = a1 + a2;
        int[] combinedArray = new int[combinedArraySize];

        for (int i = 0; i < a1; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < a2; i++) {
            combinedArray[a1 + i] = arr2[i];
        }

        return combinedArray;
    }

}
