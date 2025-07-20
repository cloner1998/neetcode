package array_and_hashing;

import java.util.*;


public class FrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int key = num;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;

    }
}
