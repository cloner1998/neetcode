import array_and_hashing.Anagram;
import array_and_hashing.FrequentElements;
import array_and_hashing.ProductOfArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0 , -3, 3};
        System.out.println(Arrays.toString(ProductOfArray.productExceptSelf(nums)));
        System.out.println(ProductOfArray.calculatePrefix(2, nums));
        System.out.println(ProductOfArray.calculateSuffix(2, nums));
    }
}