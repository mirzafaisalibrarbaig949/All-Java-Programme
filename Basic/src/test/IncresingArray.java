package test;

public class IncresingArray {



		  public static int increasingSubarray(int n, int[] arr) {
		    int maxLength = 1;
		    int currentLength = 1;
		    int indexToDelete = -1;
		    for (int i = 1; i < n; i++) {
		      if (arr[i] > arr[i - 1]) {
		        currentLength++;
		      } else {
		        if (indexToDelete == -1) {
		          indexToDelete = i - 1;
		          currentLength = 1;
		        } else {
		          maxLength = Math.max(maxLength, currentLength);
		          currentLength = 1;
		          indexToDelete = -1;
		        }
		      }
		    }
		    maxLength = Math.max(maxLength, currentLength);
		    if (indexToDelete != -1) {
		      int lengthWithDeleted = 0;
		      int currentLengthWithDeleted = 0;
		      for (int i = 1; i < n; i++) {
		        if (i == indexToDelete) {
		          continue;
		        }
		        if (arr[i] > arr[i - 1]) {
		          currentLengthWithDeleted++;
		        } else {
		          lengthWithDeleted = Math.max(lengthWithDeleted, currentLengthWithDeleted);
		          currentLengthWithDeleted = 1;
		        }
		      }
		      lengthWithDeleted = Math.max(lengthWithDeleted, currentLengthWithDeleted);
		      maxLength = Math.max(maxLength, lengthWithDeleted);
		    }
		    return maxLength;
		  }

		  public static void main(String[] args) {
		    int n = 5;
		    int[] arr = {1, 2, 5, 3, 4};
		    System.out.println(increasingSubarray(n, arr)); // Output: 4

		    n = 2;
		    arr = new int[]{1, 2};
		    System.out.println(increasingSubarray(n, arr)); // Output: 2
		  }
		}

