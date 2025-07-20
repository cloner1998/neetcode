import array_and_hashing.Anagram;
import array_and_hashing.FrequentElements;
import array_and_hashing.LongestConsecutive;
import array_and_hashing.ProductOfArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6,9,9,9,9};
        System.out.println(LongestConsecutive.longestConsecutive(nums));

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(LongestConsecutive.longestConsecutive(nums2));
        int[] nums3 = {0,0,-1};
        System.out.println(LongestConsecutive.longestConsecutive(nums3));
    }
}