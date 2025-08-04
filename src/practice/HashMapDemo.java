package practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mapDemo=new HashMap<Integer,String>();
		mapDemo.put(1, "a");
		mapDemo.put(2, "b");
		mapDemo.put(3, "c");
		mapDemo.put(4, "d");
		mapDemo.put(5, "e");
		System.out.println(mapDemo);//prints all the values of hashmap
		System.out.println(mapDemo.get(3));// It prints the value at key 3
		System.out.println(mapDemo.remove(3));//removes both key and value pair from hashmap
		System.out.println(mapDemo);
		mapDemo.put(3, "c");//adds the entry to hashmap
		System.out.println(mapDemo);
		HashMap<Integer, String> m2=new HashMap<Integer,String>();
		m2.putAll(mapDemo);//it copies all the values of mapDemo to m2 hashmap
		System.out.println(m2);
		System.out.println(mapDemo.isEmpty()); // returns true if hashmap is empty otherwise it returns false
		m2.clear();//removes all entries of the hashmap 
		System.out.println(m2);
		Set<Integer> set=mapDemo.keySet();// gets all the keys of the hashmap
		System.out.println(set);
		System.out.println(mapDemo.values());// prints all the values of the hashmap
		Collection c1=mapDemo.values();// it also prints all the values of the hashmap
		System.out.println(c1);
		// traversing through the elements of hashmap using enhanced for loop
//		for(int i: mapDemo.keySet()) {
//			System.out.println(i+" "+mapDemo.get(i));
//		}
		//traversing through the elements of the hashmap using entrySet() , getKey() and getValue() methods
		//these methods are present in Entry interface which is a sub-interface of Map Interface
		for(Map.Entry<Integer,String> entry:mapDemo.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		// traversing through the elements of hashmap using Iterator Interface
		Iterator i=mapDemo.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
