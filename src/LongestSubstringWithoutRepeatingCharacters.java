import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    // this is O(n^2)
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int max = 1;
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int start = 0;

        for (int i = 0; i < n; i++) {
            while (set.contains(chars[i])) {
                set.remove(chars[start]);
                start++;
            }

            set.add(chars[i]);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    // this is O(n) version
    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
