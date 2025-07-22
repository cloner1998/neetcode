package two_pointers;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static int maxAreaSlow(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    int heightTemp = height[i];
                    int tempArea = heightTemp * (j - i);
                    if (tempArea < 0) tempArea = -tempArea;
                    maxArea = Math.max(maxArea, tempArea);
                }
                else if (height[j] < height[i]) {
                    int temp = height[j];
                    int tempArea = temp * (i - j);
                    if (tempArea < 0) tempArea = -tempArea;
                    maxArea = Math.max(maxArea, tempArea);
                }
            }
        }
        return maxArea;
    }

    public static int maxArea(int[] height) {
        int Left = 0, Right = height.length - 1;
        int maxArea = 0;
        while (Left != Right) {
            if (height[Left] <= height[Right]) {
                maxArea = Math.max(maxArea, height[Left] * (Right - Left));
                Left++;
            }
            else if (height[Right] < height[Left]) {
                maxArea = Math.max(maxArea, height[Right] * (Right - Left));
                Right--;
            }

        }
        return maxArea;
    }
}
