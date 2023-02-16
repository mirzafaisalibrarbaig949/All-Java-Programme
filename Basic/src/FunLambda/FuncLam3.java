package FunLambda;
@FunctionalInterface
interface Product{
public abstract	int squareIt(int n);
}
public class FuncLam3 {
	public static void main(String[] args) {
		Product i=n->(n*n);
		System.out.println("The squre of number is = "+i.squareIt(4));
		System.out.println("The squre of number is = "+i.squareIt(16));
	}
}
