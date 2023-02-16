package test;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> pos = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                pos.put(a[i], i);
            }
            long ans = 0;
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                int x = a[i];
                int p = pos.get(x);
                int cnt = 1;
                if (x > 0) {
                    int j = p + 1;
                    while (j < n && a[j] > 0) {
                        cnt++;
                        j++;
                    }
                    f[j - 1] += cnt;
                    ans += cnt * (cnt + 1) / 2;
                } else {
                    int j = p - 1;
                    while (j >= 0 && a[j] < 0) {
                        cnt++;
                        j--;
                    }
                    f[j + 1] += cnt;
                    ans += cnt * (cnt + 1) / 2;
                }
            }
            for (int i = 0; i < n; i++) {
                ans -= f[i] * (f[i] - 1) / 2;
            }
            System.out.println(ans);
        }
    }
}
