import sliding_window.LongestRepeatingCharacterReplacement;
import sliding_window.LongestSubstringWithoutRepeatingCharacters;
import sliding_window.MaxSumSubArray;

public class Main {
    public static void main(String[] args) {
//        String s = "ABAB";
//        int k = 2;
//        System.out.println(LongestRepeatingCharacterReplacement.characterReplacement(s, k));
        int[] arr = {4,2,1,7,8,1,2,8,1,0};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(MaxSumSubArray.maxSumSubArray(arr2, k));
        System.out.println(MaxSumSubArray.maxSumSubArray2(arr2, k));

    }


}