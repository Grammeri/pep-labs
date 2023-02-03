
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in
     * the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {
       int endIndex = 0, currMax = nums.get(0);
       int globalMax = nums.get(0);

       for (int i=1; i< nums.size();++i){
        currMax = Math.max(nums.get(i), nums.get(i) + currMax);
        if(currMax > globalMax){
            globalMax = currMax;
            endIndex = i;
        }
       }
       int startIndex = endIndex;
       while (startIndex >=0){
        globalMax -= nums.get(startIndex);

        if (globalMax == 0)
        break;
        startIndex --;
       }
       
    return globalMax;
    }
}