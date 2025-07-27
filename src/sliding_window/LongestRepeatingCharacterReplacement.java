package sliding_window;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static Object characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int end = 0, start = 0;
        int max = 0;
        int res = 0;
        for (end = 0; end < s.length(); end++) {
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            max = Math.max(max, map.get(s.charAt(end)));

            while (end -start  + 1 - max > k) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start ++;
            }
            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}
