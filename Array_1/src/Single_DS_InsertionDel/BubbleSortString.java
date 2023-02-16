package Single_DS_InsertionDel;

public class BubbleSortString {

	public static void main(String[] args) {
		String a[]= {"Mirza","Azhar","Satya","Swagat","Asif"};
		String temp;
		int flag=0;
		System.out.print("Before sorting: ");
		for(String b:a)
			System.out.print(b+" ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
			
		}
		System.out.println();
		System.out.print("After sorting: ");
		for(String c:a)
			System.out.print(c+" ");

	}

}
