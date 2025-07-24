package sliding_window;

public class SmallestSubArray {
    public static int smallestSubArray(int[] nums, int target) {
        int smallestLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= target) {
                smallestLength = Math.min(smallestLength, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return smallestLength;
    }
}
