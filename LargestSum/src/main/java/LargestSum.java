
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestSum {
    int max1 = 0;
    int max2 = 0;
    /**
     * Get the largest possible sum that can be obtained from a pair of values in
     * the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    int maximum;

    public int bigSum(List<Integer> nums) {
        Collections.sort(nums, Collections.reverseOrder());
        if (nums.get(0) == nums.get(1)) {
            return 2 * nums.get(0);
        } else {
            return nums.get(0) + nums.get(1);
        }
    }
}

/*
 * nums = new ArrayList<Integer>();
 * Collections.sort(nums);
 * temp1=nums.get(nums.size()-1);
 * temp2=nums.get(nums.size()-2);
 * 
 * return temp1 + temp2;
 */