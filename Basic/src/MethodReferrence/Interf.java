package MethodReferrence;
@FunctionalInterface
interface Add{
	public void add(int a,int b);
	
	
}
public class Interf {
	public static void sum(int x,int y){
		System.out.println("The sum of two values is: "+(x-y));
	}
	public static void main(String[] args) {
		Add i=(a,b)->System.out.println(a+b);
		i.add(100, 200);
		Add i1=Interf::sum;
		i1.add(1000,2000);
	}
}
