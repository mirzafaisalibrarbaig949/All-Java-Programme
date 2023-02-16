package Single_DS_InsertionDel;

public class SelectionSort_String {
public static void main(String[] args) {
	String a[]= {"Mirza","Azhar","Satya","Swagat","Asif"};
	System.out.print("Before Sorting :");
	for (String b : a) {
		System.out.print(b+" ");
	int min;
	String temp;
	for (int i = 0; i < a.length; i++) {
		min=i ;
		for (int j = i+1; j < a.length; j++) {
			
			if(a[j].compareTo(a[min])<0 ){
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
	for (String c : a) {
		System.out.print(c+" ");
		
	}
}}

