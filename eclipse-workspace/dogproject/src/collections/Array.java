package collections;

import java.util.Iterator;
import java.util.Vector;


public class Array {
	public static void main(String[] args) {
		
		//ArrayList<String> names=new ArrayList<String>();
	//	LinkedList<String> names=new LinkedList<String>();
		Vector<String> names=new Vector<String>();
		names.add("lokesh");
		names.add("Pavan");
		names.add("naveen");
		names.add("tharun");
		names.add("kiran");
		names.add("venki");
		names.add("mahesh");
		names.add("hareesh");
		
		
		System.out.println(names);
		System.out.println(names.get(4));
		System.out.println(names.size());
		System.out.println(names.set(5, "loki"));
		System.out.println(names.remove(7));
		System.out.println(names);
		//names.clear();
		System.out.println(names);
		
	for(String i:names) {
		System.out.println(i);
	}
	Iterator itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
