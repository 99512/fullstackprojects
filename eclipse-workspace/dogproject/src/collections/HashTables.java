package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> bsc=new Hashtable<Integer, String>();
	
		
	//bsc.put(null, null);
	//bsc.put(4,null);
		//bsc.put(null, "pavan");
		
		
		
		bsc.put(1, "pavan");
		bsc.put(2, "naveen");
		bsc.put(3, "tharun");
		bsc.put(4, "mahesh");
		bsc.put(5, "rajesh");
		bsc.put(6, "siva");
		bsc.put(7, "kirthi");
		bsc.put(8, "ramesh");
		
	
		System.out.println(bsc);
		for(Map.Entry m:bsc.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			System.out.println("********");
			System.out.println(m.getKey()+"is halticket no for "+m.getValue());
		}
	}

}
