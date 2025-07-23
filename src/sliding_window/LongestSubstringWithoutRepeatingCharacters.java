package sliding_window;

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
                // you should always take max because start should not go backwards
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int max = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                max = Math.max(max, j-i + 1);
            }
        }
        return max;
    }
}
/*
s = "abcabcbb"

i=0, char='a': map={'a':0}, start=0, window="a" (length=1)
i=1, char='b': map={'a':0,'b':1}, start=0, window="ab" (length=2)
i=2, char='c': map={'a':0,'b':1,'c':2}, start=0, window="abc" (length=3)

i=3, char='a': DUPLICATE!
  - Found 'a' at old position 0
  - start = max(0, 0+1) = 1  [Jump past first 'a']
  - map={'a':3,'b':1,'c':2}, start=1, window="bca" (length=3)

i=4, char='b': DUPLICATE!
  - Found 'b' at old position 1
  - start = max(1, 1+1) = 2  [Jump past first 'b']
  - map={'a':3,'b':4,'c':2}, start=2, window="cab" (length=3)

i=5, char='c': DUPLICATE!
  - Found 'c' at old position 2
  - start = max(2, 2+1) = 3  [Jump past first 'c']
  - map={'a':3,'b':4,'c':5}, start=3, window="abc" (length=3)

i=6, char='b': DUPLICATE!
  - Found 'b' at old position 4
  - start = max(3, 4+1) = 5  [Jump past previous 'b']
  - map={'a':3,'b':6,'c':5}, start=5, window="cb" (length=2)

i=7, char='b': DUPLICATE!
  - Found 'b' at old position 6
  - start = max(5, 6+1) = 7  [Jump past previous 'b']
  - map={'a':3,'b':7,'c':5}, start=7, window="b" (length=1)
 */
