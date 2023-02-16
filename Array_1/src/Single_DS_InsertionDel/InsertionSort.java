package Single_DS_InsertionDel;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {38,52,45,9,18,6,13};
		System.out.print("Before Sorting :");
		for (int b : a) {
			System.out.print(b+" ");
		}
		int temp,j;
			for (int i = 0; i < a.length; i++) {
				temp=a[i];
				j=i;
				while(j>0 && a[j-1]>temp) {
					a[j]=a[j-1];
					j=j-1;
				}
				a[j]=temp;
				
			}
			System.out.println();
			System.out.print("After sorting: ");
			for (int c : a) {
				System.out.print(c+" ");
				
			}
	}

}

