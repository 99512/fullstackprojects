package collections;

import java.util.Iterator;

public class Stack {
	
	public static void main (String args[])
	{
		java.util.Stack<String> names=new java.util.Stack<String>();
		
		names.push("lokesh");
		names.push("Pavan");
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
		System.out.println(names.pop());
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
