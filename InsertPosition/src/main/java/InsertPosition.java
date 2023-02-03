
public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position
     * 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums   an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted
     *         array.
     */
    int K;

    int end;
    int mid;

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] >= target) {
            return start;
        } else if (nums[start] < target && target <= nums[end]) {
            return end;
        } else {
            return end + 1;
        }

    }
}

/*
 * int newarr[] = new int[nums.length + 1];
 * for (int i = 0; i < nums.length + 1; i++) {
 * if (i < target - 1)
 * newarr[i] = nums[i];
 * else if (i == nums.length - 1)
 * newarr[i] = target;
 * else
 * newarr[i] = nums[i - 1];
 * }
 * return target-1;
 */
