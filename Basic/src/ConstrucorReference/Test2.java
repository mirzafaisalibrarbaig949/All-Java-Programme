package ConstrucorReference;


 class Sample1{
Sample1(String s){
System.out.println("Sample class costructor : "+s);
}
}
interface Interf1{
public Sample1 get(String s) ;
}
public class Test2{
public static void main(String[] args) {
Interf1 i=Sample1::new;
Sample1 s1=i.get("Mirza");
Sample1 s2=i.get("Mukesh");
}
}
