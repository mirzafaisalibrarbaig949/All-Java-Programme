package ArrayBasic;

public class ArrayRetrive_2D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{20,30,40,50},{10,20}};
		System.out.println(a);			//[[I@7c75222b
		System.out.println(a[0]);		//[I@58ceff1
		System.out.println(a[0][0]);	//10->it is a first value of array
		System.out.println(a.length);	//2->array size two dimension array
		System.out.println(a[0].length);	//3->in 2-d array , 1st 1-D array length
		System.out.println(a[1].length);	//4->in 2-d array , 2nd 1-D array length
//		System.out.println(a[0][0].length);	//Error
		System.out.println("2D array is : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println( );
			
		}
	}

}
