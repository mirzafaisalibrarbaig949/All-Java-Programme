package PreFunction;

import java.util.function.Predicate;

public class PreidcateLenString {
public static void main(String[] args) {
	Predicate<String>p=(s)->s.length()>5;
	System.out.println(p.test("Mirza Faisal"));
	System.out.println(p.test("Mirza"));
	//WAP to find string length whose length greater than 5
	String s2[]= {"Mirza","satya","Bunu","Chunky","Sipu"};
	Predicate<String>p1=s3->s3.length()>=5;
	for(String a:s2) {
		if(p1.test(a)) {
			System.out.println(a);
		}
	}
	//WAP to find string length whose length it even number
	System.out.println("Even length string number");
		Predicate<String>p2=s3->s3.length()%2==0;
		for(String a:s2) {
			if(p2.test(a)) {
				System.out.println(a);
			}
		}
}
}
