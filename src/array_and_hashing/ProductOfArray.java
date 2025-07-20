package array_and_hashing;


public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

    public static int calculatePrefix(int i, int[] nums) {
        int product = 1;
        for (int j = i-1 ; j >= 0 ; j--) {
            product *= nums[j];
        }
        return product;
    }

    public static int calculateSuffix(int i, int[] nums) {
        int product = 1;
        for (int j = i+1 ; j < nums.length ; j++) {
            product *= nums[j];
        }
        return product;
    }
}
