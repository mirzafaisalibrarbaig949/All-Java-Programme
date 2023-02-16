package Single_DS_InsertionDel;

public class InsertionSort_String {
	public static void main(String[] args) {
		String a[]= {"Mirza","Azhar","Satya","Swagat","Asif"};
		System.out.print("Before Sorting :");
		for (String b : a) {
			System.out.print(b+" ");
		}
		String temp;
		int j;
			for (int i = 0; i < a.length; i++) {
				temp=a[i];
				j=i;
				while(j>0 && a[j-1].compareTo(temp)>0) {
					a[j]=a[j-1];
					j=j-1;
				}
				a[j]=temp;
				
			}
			System.out.println();
			System.out.print("After sorting: ");
			for (String c : a) {
				System.out.print(c+" ");
				
			}
	}

}

