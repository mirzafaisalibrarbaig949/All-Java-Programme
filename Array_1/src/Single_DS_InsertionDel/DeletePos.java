package Single_DS_InsertionDel;

import java.util.Scanner;

public class DeletePos {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]= {1,2,3,4,56,7};
		int b[]=new int[a.length-1];
		System.out.println("Elements in array is :");
		for(int c:a)
			System.out.print(c+" ");

		int pos=sc.nextInt();//3
		System.out.println("After deleteion in array: ");
		for (int i = 0; i < a.length-1; i++) {//a[]=1,2,3,4,56,7
			if(i<pos) {
				b[i]=a[i];
			}
			else if(i==pos) {
				continue;
			}
			else {
				b[i+1]=a[i];
			}
			
		}
		for (int c:b) {
			System.out.print(c+" ");
		}
	}

}
