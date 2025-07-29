package binary_search;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = nums[0];
        if (nums.length == 1) return min;
        while (low <= high) {
            // here you find min and if you continue you will get overflow
            if (nums[low] < nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }


            int mid = low + (high - low) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return min;
    }

    public static int findMinSlow(int[] nums){
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
