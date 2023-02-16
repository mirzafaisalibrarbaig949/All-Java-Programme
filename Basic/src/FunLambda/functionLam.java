package FunLambda;
@FunctionalInterface
interface Interf{
	public abstract void m1();
	
}
public class functionLam {
	public static void main(String[] args) {
		Interf i=()->System.out.println("hello lambda expression");
		i.m1();
	}
}
