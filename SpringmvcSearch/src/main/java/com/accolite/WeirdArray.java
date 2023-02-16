package com.accolite;
import java.util.*;

public class WeirdArray {

    public static int weirdArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int minSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == maxCount) {
                int j = i;
                while (j < arr.length && arr[j] == arr[i]) {
                    j++;
                }
                minSize = Math.min(minSize, j - i);
                i = j - 1;
            }
        }

        return minSize == arr.length ? 0 : minSize;
    }
    
}
