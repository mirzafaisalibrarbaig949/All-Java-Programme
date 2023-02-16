package com.accolite;

import java.util.List;
import java.util.*;

import java.util.*;

public class Be {

	static ArrayList<Integer>[] graph;
	static int[] letter;
	static int[] visted;
	static int[][] mem;

	static int beauty(int v, int e, String s, int[] x, int[] y) {
		// TODO Auto-generated method stub

		graph = new ArrayList[v + 1];

		for (int i = 0; i <= v; i++)
			graph[i] = new ArrayList<Integer>();

		for (int i = 0; i < e; i++) {
			int from = x[i];
			int to = y[i];
			graph[from].add(to);
		}

		letter = new int[v + 1];

		for (int i = 1; i <= v; i++) {
			letter[i] = s.charAt(i - 1) - 'a';
		}

		visted = new int[v + 1];
		mem = new int[v + 1][26];

		//
		for (int i = 1; i <= v; i++) {
			if (visted[i] == 0 && dfs(i)) {
				return -1;
			}
		}
		int ans = 0;
		for (int i = 0; i <= v; i++)
			for (int j = 0; j < 26; j++)
				ans = Math.max(ans, mem[i][j]);

		return ans;
	}

	private static boolean dfs(int vertex) {
		visted[vertex] = 1;
		for (int to : graph[vertex]) {
			if (visted[to] == 1)
				return true;
			if (visted[to] == 0 && dfs(to))
				return true;
			for (int i = 0; i < 26; i++) {
				mem[vertex][i] = Math.max(mem[vertex][i], mem[to][i]);
			}
		}

		mem[vertex][letter[vertex]]++;
		visted[vertex] = 2;
		return false;
	}

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		String s = "abaca";
		int x[] = { 1, 1, 3, 4 };
		int y[] = { 2, 3, 4, 5 };

		int result = Be.beauty(n, m, s, x, y);
		System.out.println(result);
	}

}
