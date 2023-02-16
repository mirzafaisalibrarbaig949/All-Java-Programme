package com.accolite.assignment;
import java.util.*;

public class Main {
    public static int weirdArray(int[] input, int n) {
        int result = Integer.MAX_VALUE;
        if (n == 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> mp = new HashMap<>();
            int mf = -1;
            int sm = -1;
            for (int j = i; j < n; j++) {
                if (mp.containsKey(input[j])) {
                    mp.put(input[j], mp.get(input[j]) + 1);
                } else {
                    mp.put(input[j], 1);
                }
                if (mp.get(input[j]) > mf) {
                    sm = mf;
                    mf = mp.get(input[j]);
                } else if (mp.get(input[j]) > sm && mp.get(input[j]) != mf) {
                    sm = mp.get(input[j]);
                }
                if (j - i + 1 > 1 && mf > 0 && sm > 0) {
                    result = Math.min(j - i + 1, result);
                }
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