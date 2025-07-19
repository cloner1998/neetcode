package array_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {

    public static boolean containDuplicate(int[] nums) {
        Map<Integer, Integer> numbersCount = new HashMap<>();
        for (int num : nums) {
            numbersCount.put(num, numbersCount.getOrDefault(num, 0) + 1);
        }

        for (int count : numbersCount.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}
