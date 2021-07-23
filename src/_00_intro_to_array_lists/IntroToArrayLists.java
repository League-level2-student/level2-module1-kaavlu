package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> names = new ArrayList<String>();
		//   Don't forget to import the ArrayList (java.util) class

		//2. Add five Strings to your list
		names.add("Jan");
		names.add("Sara");
		names.add("Fred");
		names.add("Marc");
		names.add("Jeff");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : names){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i < names.size(); i=i+2){
			String s = names.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		for(int i = names.size(); i < 1 ; i--){
			String s = names.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < names.size(); i++){
			if(names.contains("e")) {
				String s = names.get(i);
				System.out.println(s);
			}
			else {
				System.out.println("--");
			}
		}
		
	}
}
