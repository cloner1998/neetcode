import array_and_hashing.Anagram;
import array_and_hashing.FrequentElements;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 2, 2, 5, 5};
        System.out.println(FrequentElements.topKFrequent(nums, 2));
    }
}