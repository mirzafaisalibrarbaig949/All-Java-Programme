package ArrayBasic;

public class ArrayRetrive_3D {

	public static void main(String[] args) {
		int a[][][]= {{{10,20},{30,40,50,60},{70,80,90}}};
		int[][][] b = {{{1, -2, 3},  {2, 3, 4} }, { {-4, -5, 6, 9},  {1}, {2, 3}}} ;
		System.out.println(a);			//[[[I@7c75222b
		System.out.println(a[0]);		//[[I@58ceff1
		System.out.println(a[0][0]);	//[I@7c30a502
		System.out.println(a[0][0][0]);	//10->it is a first value of array
		System.out.println(a.length);	//1->array size Three dimension array
		System.out.println(a[0].length);	//3->in 3-d array , 1st 1-D array length
		System.out.println(a[0][0].length);	//2->in 3-d array , 1st-1st 1-D array length
		System.out.println(a[0][1].length);	//4->in 3-d array , 1st-2nd 1-D array length
		System.out.println(a[0][2].length);	//3->in 3-d array , 1st-3rd 1-D array length
		
		System.out.println("3D array is : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
		}
	}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < b[i][j].length; k++) {
					System.out.print(b[i][j][k]+" ");
					
				}
				System.out.println();

}
	}
		}
	}
