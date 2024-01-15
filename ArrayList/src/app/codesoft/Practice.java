package app.codesoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class Practice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Violet");
		list.add("Indigo");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		list.add("Orange");
		list.add("Red");
		//3. Write a Java program to insert an element into the array list at the first position.
		list.add(0, "White");
		System.out.println(list);
		//4.Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("element at 7th index is "+list.get(7));
		
		//2. Write a Java program to iterate through all elements in an array list.
//				for(String s : list) {
//					System.out.println(s);
//				}
		
		//list.stream().forEach(System.out::println);
		
		//5. Write a Java program to update an array element by the given element.
		list.add(0,"Updated White Gold");
		System.out.println(list);
		
		//6. Write a Java program to remove the third element from an array list.
		list.remove(3);
		System.out.println("updated list after removing the 3rd element \n"+list);
		
		//7. Write a Java program to search for an element in an array list.
		if(list.contains("Orange")) {
			System.out.println("Found orange!");
		}else {
			System.out.println("Color not found!");
		}
		
		//8. Write a Java program to sort a given array list.
		System.out.println("List before sorting "+list);
		Collections.sort(list);
		System.out.println("List after sorting "+list);
		
		//9. Write a Java program to copy one array list into another.
		ArrayList<String> listToBeCopied = new ArrayList<>();
		listToBeCopied.add("Red");
		listToBeCopied.add("Orange");
		list.addAll(listToBeCopied);
		System.out.println("List with copied elements : "+list);
		
		//10. Write a Java program to shuffle elements in an array list
		Collections.shuffle(list);
		System.out.println("Shuffled list :"+list);
		
		//11. Write a Java program to reverse elements in an array list.
		Collections.reverse(list);
		System.out.println("Reversed list "+list);
		
		//12. Write a Java program to extract a portion of an array list.
		List<String> subList = list.subList(0, 5);
		System.out.println("Sub list from 0 to 5 "+subList);
		
//		//13. Write a Java program to compare two array lists.
//		List<String> result = new ArrayList<>();
//		for(String s: list) {
//		result.add(list.contains(listToBeCopied)? "Yes":"No");
//		}
//		System.out.println("Comparing lists result "+result);
		
		//14. Write a Java program that swaps two elements in an array list.
		System.out.println("List before swapping "+listToBeCopied);
		Collections.swap(listToBeCopied, 0,1);
		System.out.println("List after swapping "+listToBeCopied);
		
		//15. Write a Java program to join two array lists.
		List<String> joinedList = new ArrayList<>();
		joinedList.addAll(list);
		joinedList.addAll(listToBeCopied);
		System.out.println("List after joining list and listToBeCopied "+joinedList);
		
		//16. Write a Java program to clone an array list to another array list.
		List<String> clonedList = new ArrayList<>();
		clonedList = (List<String>)list.clone();
		System.out.println("cloned list is "+clonedList);
		
		//17. Write a Java program to empty an array list.
		System.out.println("Remove all elements from cloned list "+clonedList.removeAll(clonedList));
		System.out.println("List clonedList after removing all elemnts is "+clonedList);
		
		//18. Write a Java program to test whether an array list is empty or not.
		if(clonedList.isEmpty()) {
			System.out.println("list is empty");
		}else {
			System.out.println("list is not empty");
		}
		
		
	}
}
