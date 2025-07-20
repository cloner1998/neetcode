package array_and_hashing;

import java.util.*;

public class Anagram {

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


    // this function get Time Limit Exceed
    public static List<List<String>> groupAnagrams_slow(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> answer = new ArrayList<>();
            answer.add(strs[i]);
            used[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    answer.add(strs[j]);
                    used[j] = true;

                }
            }
            result.add(answer);

        }

        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // first try to get key but if it does not exist first do the function and then continue
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

            // you can do this instead:
            /*
            if (!map.contain(key){
                map.put(key, new ArrayList<>())
            }
            map.get(key).add(str)
             */
        }
        return new ArrayList<>(map.values());
    }

}
