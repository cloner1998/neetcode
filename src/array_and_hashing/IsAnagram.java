package array_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        return map.values().stream().allMatch(value -> value == 0);
    }
}
