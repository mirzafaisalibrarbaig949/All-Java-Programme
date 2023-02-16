package com.accolite.assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Hellow {
	public static int weirdArray(int[] a, int n) {
		int num = Integer.MIN_VALUE;
		int count = 0, fin = 0, finnum = 0;
		for (int i = 0; i < n; i++)
		{
			num = a[i];
			count = 0;
			for (int j = 0; j < n; j++)
			{
				if (a[j] == num) 
				{
					count++;
				}
			}
			if (count > fin)
			{
				fin = count;
				finnum = num;
			}

		}
		int countt=0,finn=Integer.MAX_VALUE,inc=0;
		for (int i = 0; i < n; i++) {
			countt=0;
			if(a[i] == finnum) {
				while(a[i]== finnum) {
					countt++;
					if(i==n-1)break;
					i++;
				}
				if(countt <finn)
					finn=countt;
			}
			
		}

		return finnum;
	}
	public static void main(String[] args) {
		int a[] = { 3, 3, 1, 3, 3 };
		int b[] = { 1,2,1,2,2 };
		int[] c = { 3, 3, 1, 2, 1, 3, 3, 4, 1, 2 };
		int[] d = { 1, 2, 1, 1, 1, 4, 1, 2 };
		int[] e = { 1, 2, 1, 3, 3, 4, 1, 2 };

		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;
		int n4 = d.length;
		int n5 = e.length;
//		int aaa=(weirdArray(a, n1));
		int aaa=(weirdArray(b, n2));
		System.out.println(weirdArray(c, n3));
		System.out.println(weirdArray(d, n4));
		System.out.println(weirdArray(e, n5));
		int ze=0;
//		int aaa=Integer.MAX_VALUE;
		if(aaa== Integer.MAX_VALUE) {
			System.out.println(ze+"hiihdja");
		}
		else {
			System.out.println(aaa+"dkjsnk");
		}
	}

}
