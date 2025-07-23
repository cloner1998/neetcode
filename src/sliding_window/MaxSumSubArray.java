package sliding_window;

public class MaxSumSubArray {

    public static int maxSumSubArray(int[] arr, int window) {
        int sum = 0;
        for (int i = 0; i < window; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = window -1 ; i < arr.length -1; i++) {
            sum = sum - arr[i - window + 1] + arr[i+1];
            max = Math.max(max, sum);
        }
        return max;

    }

    // we can even handle first loop inside second loop
    public static int maxSumSubArray2(int[] arr, int window) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= window-1){
                max = Math.max(max, sum);
                sum = sum - arr[i - (window-1)];
            }
        }
        return max;
    }

}
