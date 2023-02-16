package test;

import java.util.*;

public class WeirdArray {

	public static int weirdArray(int[] arr, int n) {

		if (n == 1)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxFreq = 0;
		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			maxFreq = Math.max(maxFreq, map.get(arr[i]));
		}
		if (maxFreq == 1)
			return 0;
		int start = 0, end = 0;
		int count = 0;
		int result = n;
		while (end < n) {
			int num = arr[end];
			if (map.get(num) == maxFreq) {
				count++;
			}
			end++;
			while (count == maxFreq) {
				result = Math.min(result, end - start);
				int startNum = arr[start];
				if (map.get(startNum) == maxFreq) {
					count--;
				}
				start++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { 3, 3, 1, 3, 3 };
		int b[] = { 5 };
		int[] c = { 3, 3, 1, 2, 1, 3, 3, 4, 1, 2 };
		int[] d = { 1, 2, 1, 1, 1, 4, 1, 2 };
		int[] e = { 1, 2, 1, 3, 3, 4, 1, 2 };

		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;
		int n4 = d.length;
		int n5 = e.length;
		System.out.println(weirdArray(a, n1));
		System.out.println(weirdArray(b, n2));
		System.out.println(weirdArray(c, n3));
		System.out.println(weirdArray(d, n4));
		System.out.println(weirdArray(e, n5));

	}
}