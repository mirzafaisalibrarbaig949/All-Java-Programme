package com.accolite;
import java.util.*;

public class Be1 {
	 public static int beauty(int n, int m, String S, int[] X, int[] Y) {
	        Map<Character, Integer> freq = new HashMap<>();
	        for (char c : S.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }

	        int maxFreq = 0;
	        for (int f : freq.values()) {
	            maxFreq = Math.max(maxFreq, f);
	        }

	        Map<Integer, List<Integer>> graph = new HashMap<>();
	        for (int i = 0; i < m; i++) {
	            int x = X[i] - 1, y = Y[i] - 1;
	            graph.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
	        }

	        List<Integer> topoorder = topologicalSort(graph, n);
	        int[] maxBeauty = new int[n];

	        for (int node : topoorder) {
	            for (int child : graph.getOrDefault(node, new ArrayList<>())) {
	                maxBeauty[child] = Math.max(maxBeauty[child], maxBeauty[node] + (freq.get(S.charAt(node)) == maxFreq ? 1 : 0));
	            }
	        }

	        return Math.max(maxBeauty[n - 1], -1);
	    }

	    private static List<Integer> topologicalSort(Map<Integer, List<Integer>> graph, int n) {
	        int[] inDegree = new int[n];
	        for (int node : graph.keySet()) {
	            for (int child : graph.get(node)) {
	                inDegree[child]++;
	            }
	        }

	        List<Integer> queue = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            if (inDegree[i] == 0) {
	                queue.add(i);
	            }
	        }

	        List<Integer> topoorder = new ArrayList<>();
	        while (!queue.isEmpty()) {
	            int node = queue.remove(0);
	            topoorder.add(node);
	            for (int child : graph.getOrDefault(node, new ArrayList<>())) {
	                inDegree[child]--;
	                if (inDegree[child] == 0) {
	                    queue.add(child);
	                }
	            }
	        }

	        return topoorder;
	    }
	    public static void main(String[] args) {
			int n=5;
			int m=4;
			String s="abaca";
			int x []= {1,1,3,4};
			int y[]= {2,3,4,5};
			
			int result=Be.beauty(n, m, s, x, y);
			System.out.println(result);
		}

}
