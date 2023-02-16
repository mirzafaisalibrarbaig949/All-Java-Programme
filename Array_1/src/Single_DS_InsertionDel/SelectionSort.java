package Single_DS_InsertionDel;

public class SelectionSort {
public static void main(String[] args) {
	int a[]= {38,52,45,9,18,6,13};
	System.out.print("Before Sorting :");
	for (int b : a) {
		System.out.print(b+" ");
	int min,temp=0;
	for (int i = 0; i < a.length; i++) {
		min=i ;
		for (int j = i+1; j < a.length; j++) {
			
			if(a[j]<a[min]) {
				min=j;
			}
		}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
	}
	System.out.println();
	System.out.print("After sorting: ");
	for (int c : a) {
		System.out.print(c+" ");
		
	}
}}

