package test;
import java.util.*;
public class TEst {
	public static int weirdArray(int n, int[] arr) {
	    Map<Integer, Integer> dic = new HashMap<>();
	    int ans = Integer.MAX_VALUE;
	    for (int idx = 0; idx < n; idx++) {
	        int num = arr[idx];
	        if (dic.containsKey(num)) {
	            ans = Math.min(ans, idx - dic.get(num) + 1);
	        }
	        dic.put(num, idx);
	    }
	    if (ans == Integer.MAX_VALUE) {
	        ans = 0;
	    }
	    return ans;
	}
	public static void main(String[] args) {
		int a[]= {3,3,1,3,3};
		int b[]= {5};
		int n1=a.length;
		int n2=b.length;
		System.out.println(weirdArray(n1, a));
		System.out.println(weirdArray(n2, b));
	}

}
