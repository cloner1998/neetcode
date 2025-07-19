import array_and_hashing.ContainDuplicate;
import array_and_hashing.IsAnagram;
import array_and_hashing.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));
    }
}