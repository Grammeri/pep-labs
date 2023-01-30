import java.util.Arrays;

public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length -1;
        while(i<j){
            int temp = arr[i] + arr[j];
            if(temp == target){
                return true;
            }
        }
        return false;
        
        
    }
}
