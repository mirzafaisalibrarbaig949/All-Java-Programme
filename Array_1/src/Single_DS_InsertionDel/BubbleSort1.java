package Single_DS_InsertionDel;

public class BubbleSort1 {

	public static void main(String[] args) {
		int a[]= {10,90,5,60,80,100};
		System.out.print("Before sorting :");
		for(int b:a)
			System.out.print(b+" ");
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
			}
		System.out.println();
		System.out.print("After sorting :");
		for (int c : a) {
			System.out.print(c+" ");
			
		}
	}

}
