package Single_DS_InsertionDel;
import java.util.Scanner;

public class CreateArrayUSer {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter range of array: ");
		int n=sc.nextInt();
		System.out.println("Enter values: ");
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			
			a[i]=sc.nextInt();
		}
		System.out.println("Values are : ");
		for (int b:a) {
			System.out.println(b);
		}

	}

}
