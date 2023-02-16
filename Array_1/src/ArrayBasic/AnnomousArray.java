package ArrayBasic;

public class AnnomousArray {
	public static void sum(int a[]){
		int sum=0;
		for (int i : a) {
			sum+=i;
		
		}
		System.out.println("Sum allents in array is : "+sum);
		
	}

	public static void main(String[] args) {
		AnnomousArray.sum(new int [] {10,20,30});
	

	}

}
