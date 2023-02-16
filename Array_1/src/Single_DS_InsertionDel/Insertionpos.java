package Single_DS_InsertionDel;

import java.util.Scanner;

public class Insertionpos {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
//		System.out.println("Enter array size of array: ");
//		int n=sc.nextInt();
//		System.out.println("Enter values of Array: ");
//		int a[]=new int[n];
		int a[]= {1,2,34,5,6,7};
		int c[]=new int[a.length+1];
		
		
		
//		System.out.println("Elements are : ");
//		for (int i = 0; i < a.length; i++) {
//			a[i]=sc.nextInt();
//			
//			
//		}
		System.out.println("Before value insertion: ");
		for (int b:a) {
			System.out.print(b+" ");
		}
		int pos=1;
		System.out.println("Enter a value ou want to insert : ");
		int value=sc.nextInt();
		for (int i = 0; i < a.length+1; i++) {
			if(i<pos) {
				c[i]=a[i];
				
			}
			else if(pos==i) {
				c[i]=value;
			}
			else {
				c[i]=a[i-1];
			}
			
		}
		System.out.println("After value insertion: ");
		for (int b:c) {
			System.out.print(b+" ");
		}
	}

}
