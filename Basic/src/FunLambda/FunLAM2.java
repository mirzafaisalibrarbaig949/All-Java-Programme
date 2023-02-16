package FunLambda;
@FunctionalInterface
interface ADD{
	public abstract void add(int a,int b);
}
public class FunLAM2 {
	public static void main(String[] args) {
		ADD add=(a,b)->System.out.println("The sum of number is = "+(a+b));
		add.add(10, 20);
		add.add(300, -200);
		add.add(1000, 2000);
	}
}
