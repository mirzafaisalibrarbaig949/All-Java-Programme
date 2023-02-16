package test;

public class Main {
	  public static int increasingSubarray(int[] a) {
	    if (a.length <= 1) {
	      return 1;
	    }
	    if (a.length == 2) {
	      if (a[1] > a[0]) {
	        return 2;
	      } else {
	        return 1;
	      }
	    }
	    int[] li = new int[a.length];
	    int i = 0;
	    int count = 0;
	    while (i < a.length - 1) {
	      int j = i + 1;
	      if (a[j] > a[i]) {
	        li[count] = a[j];
	        count++;
	        i++;
	      } else if (a[j + 1] > a[i]) {
	        li[count] = a[j];
	        count++;
	        i += 2;
	      } else {
	        i++;
	      }
	    }
	    return count + 1;
	  }

	  public static void main(String[] args) {
	    int[] a = {1, 2, 5, 3,};
	    System.out.println(increasingSubarray(a));

	    int[] a1 = {1, 2};
	    System.out.println(increasingSubarray(a1));
	  }
	}