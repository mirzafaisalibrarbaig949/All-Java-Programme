package HashMap;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
public static void main(String[] args) {

	

	   
	        
	        Map<String, Integer> items = new HashMap<>();
	        items.put("coins", 5);
	        items.put("pens", 2);
	        items.put("chairs", 7);

	        items.forEach((k,v) -> {
	            //System.out.format("key: %s, value: %d%n", k, v);
	            System.out.println(k+" :"+v);
	        });
	    }
	}

