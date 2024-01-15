package app.codesoft;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class HashSetPractice {
	
	public static void main(String[] args) {
		//1. Write a Java program to append the specified element to the end of a hash set.
		//create an empty hashset
		HashSet<String> set = new HashSet<>();
		//use add() method to add elements to the hashset
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		//print the hashset
		System.out.println("The hashset is "+set);
		
		System.out.println("---------------------------------------------------");
		
		//2. Write a Java program to iterate through all elements in a hash list.
		System.out.println("Iterating hashset with the help of advance for loop");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		
		System.out.println("Iterating hashset with the help of iterator ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//3. Write a Java program to get the number of elements in a hash set.
		System.out.println("HashSet has "+set.size()+" number of elements");
		
		//4. Write a Java program to empty an hash set.
		//System.out.println("Set before emptying "+set);
		//set.removeAll(set);
		//System.out.println("Set after emptying "+set);
		
		//5. Write a Java program to test if a hash set is empty or not.
		if(set.isEmpty()) {
			System.out.println("Set is empty");
		}else {
			System.out.println("Set is not empty");
		}
		
		//6. Write a Java program to clone a hash set to another hash set.
		HashSet<String> clonedSet = new HashSet<>();
		System.out.println("Set before cloning "+clonedSet);
		clonedSet = (HashSet<String>) set.clone();
		System.out.println("Set aftter cloning "+clonedSet);
		
		System.out.println("------------------------------------------------------");
		//7. Write a Java program to convert a hash set to an array.
		String[] setArray = new String[set.size()];
		set.toArray(setArray);
		System.out.println("After converting hashset to array");
		for(String s : setArray) {
			System.out.println(s);
		}
	}
}
