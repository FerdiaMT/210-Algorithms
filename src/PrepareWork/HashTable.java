package PrepareWork;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>(10);
		
		table.put(100, "Spongebob");
		
		System.out.println(table.get(100));
	}
}
