package ConstrucorReference;
class Sample{
	Sample(){
		System.out.println("Sample class costructor");
	}
}
interface Interf{
	
public Sample get() ;
	
}
class Test1{
	public static void main(String[] args) {
		Interf i=Sample::new;
		Sample s1=i.get();
		
	}
}
