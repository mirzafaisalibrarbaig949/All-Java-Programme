package com.accolite;

import java.util.*;
public class Be2 {

	
	    public static int beauty(int m, int n, String s, int[] u, int[] v) {
	        Map<Integer, List<Integer>> graph = new HashMap<>();
	        for (int i = 0; i < m; i++) {
	            int node1 = u[i];
	            int node2 = v[i];
	            graph.putIfAbsent(node1, new ArrayList<>());
	            graph.putIfAbsent(node2, new ArrayList<>());
	            graph.get(node1).add(node2);
	            graph.get(node2).add(node1);
	        }
	        int maxBeauty = 0;
	        for (int start : graph.keySet()) {
	            int[] distances = new int[n + 1];
	            Arrays.fill(distances, Integer.MAX_VALUE);
	            Queue<Integer> queue = new LinkedList<>();
	            queue.offer(start);
	            distances[start] = 0;
	            while (!queue.isEmpty()) {
	                int node = queue.poll();
	                for (int neighbor : graph.get(node)) {
	                    if (distances[neighbor] == Integer.MAX_VALUE) {
	                        distances[neighbor] = distances[node] + 1;
	                        queue.offer(neighbor);
	                    }
	                }
	            }
	            int beauty = 26;
	            int currentBeauty = 0;
	            for (int i = 1; i <= n; i++) {
	                if (distances[i] == Integer.MAX_VALUE) {
	                    continue;
	                }
	                char c = s.charAt(i - 1);
	                if (Character.isAlphabetic(c)) {
	                    currentBeauty += (c - 'a' + 1) * beauty;
	                    beauty--;
	                }
	            }
	            maxBeauty = Math.max(maxBeauty, currentBeauty);
	        }
	        
	        return maxBeauty > 1000 ? -1 : maxBeauty;
	    }
	    public static void main(String[] args) {
			int n=5;
			int m=4;
			String s="bbbcde";
			int x []= {1,1,3,4};
			int y[]= {2,3,4,5};
			
			int result=Be.beauty(n, m, s, x, y);
			System.out.println(result);
		}

	

}
