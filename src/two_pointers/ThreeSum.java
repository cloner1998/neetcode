package two_pointers;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {

    // it gets time limit error
    public static List<List<Integer>> threeSum_slow(int[] nums) {
        Set<List<Integer>> uniqueRes = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(tmp);
                        uniqueRes.add(tmp);
                    }
                }
            }
        }


        return new ArrayList<>(uniqueRes);
    }


    // this piece of code amazingly has O(n^3) complexity
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> twoSums = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> tmp = Arrays.asList(nums[i] + nums[j], i, j);
                twoSums.add(tmp);
            }
        }
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (List<Integer> twoSum : twoSums) {
                if (twoSum.get(1) != i && twoSum.get(2) != i && nums[i] + twoSum.get(0) == 0 ) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[twoSum.get(1)], nums[twoSum.get(2)]);
                    Collections.sort(temp);
                    res.add(temp);
                }
            }
        }

        return new ArrayList<>(res);
    }
}
